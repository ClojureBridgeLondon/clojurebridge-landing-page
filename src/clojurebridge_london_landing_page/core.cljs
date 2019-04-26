(ns ^:figwheel-hooks clojurebridge-london-landing-page.core
  (:require
   [goog.dom :as gdom]
   [reagent.core :as reagent :refer [atom]]
   [clojurebridge-london-landing-page.content :as content]))

(println (js/Date.) "Reloading: src/clojurebridge_london_landing_page/core.cljs")



;; Application State
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom
                     {:text "Hello world!"
                      :sponsors
                      {:current {:name    "Functional Works"
                                 :logo    "images/functional-works-logo.svg"
                                 :website "https://functional.works-hub.com/"
                                 :message "Breaking down the barriers to hiring the right software engineers, providing a platform to managing the whole process (written in ClojureScript)."}
                       :past    {}}}))



;; Website structure
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn main-page []
  [:div
   [content/navigation-top]
   [content/hero-banner]
   [content/sponsor-current (get-in @app-state [:sponsors :current])]
   [content/overview]
   [content/showcase]
   [content/learning-paths]
   [content/install]
   [content/schedule]
   [content/resources]
   [content/coaches]
   ])


;; System configuration code
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn get-app-element []
  (gdom/getElement "app"))

(defn mount [el]
  (reagent/render-component [main-page] el))

(defn mount-app-element []
  (when-let [el (get-app-element)]
    (mount el)))

;; conditionally start your application based on the presence of an "app" element
;; this is particularly helpful for testing this ns without launching the app
(mount-app-element)

;; specify reload hook with ^;after-load metadata
(defn ^:after-load on-reload []
  (mount-app-element)
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
