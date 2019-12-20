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
                      {:current {:name    "Signal AI"
                                 :logo    "images/signal-ai-logo.svg"
                                 :website "https://signal-ai.com/"
                                 :message "Signal AI is the leading AI driven global solution provider for real-time unlimited information and insights for media monitoring, reputation management and market intelligence"}
                       :past    {:name    "Functional Works"
                                 :logo    "images/functional-works-logo.svg"
                                 :website "https://functional.works-hub.com/"
                                 :message "Breaking down the barriers to hiring the right software engineers, providing a platform to managing the whole process (written in ClojureScript)."}}}))



;; Website structure
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn main-page []
  [:div
   [content/navigation-top]
   [content/banner-columns]
   [content/sponsor-current (get-in @app-state [:sponsors :current])]
   (content/level-separator "overview")
   [content/overview]
   (content/level-separator "showcase")
   [content/showcase]
   (content/level-separator "learning-paths")
   [content/learning-paths]
   (content/level-separator "install")
   [content/install]
   (content/level-separator "schedule")
   [content/schedule]
   (content/level-separator "resources")
   [content/resources]
   (content/level-separator "coaches")
   [content/coaches]
   (content/level-separator "sponsors")
   [content/sponsors]
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
