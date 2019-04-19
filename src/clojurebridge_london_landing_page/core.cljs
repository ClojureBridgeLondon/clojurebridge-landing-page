(ns ^:figwheel-hooks clojurebridge-london-landing-page.core
  (:require
   [goog.dom :as gdom]
   [reagent.core :as reagent :refer [atom]]))

(println "This text is printed from src/clojurebridge_london_landing_page/core.cljs. Go ahead and edit it and see reloading in action.")

(defn multiply [a b] (* a b))


;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:text "Hello world!"}))

(defn get-app-element []
  (gdom/getElement "app"))

(defn lorem-ipsum
  "Placeholder text to help test the UI of the web page"
  []
  [:section {:class "section"}

   ;; Content will just use HTML tags directly, useful when you have no specific styles
   ;; https://bulma.io/documentation/elements/content/
   [:div {:class "content"}
    [:p
     "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras sed enim ante. Nullam consectetur, sapien in rutrum facilisis, augue velit finibus est, at lobortis odio eros sollicitudin risus. Nullam mollis, metus a varius volutpat, metus elit mollis est, finibus pretium dui enim non velit. Praesent sit amet volutpat nulla. Sed volutpat venenatis nisi id sagittis. Nunc nec efficitur mi. Duis consequat sapien ultricies quam bibendum, elementum faucibus sapien bibendum. Morbi diam elit, gravida iaculis metus vitae, ullamcorper mattis mi. Maecenas luctus lorem metus. Maecenas eleifend nisl sit amet felis accumsan, sit amet tincidunt turpis consequat. Cras non molestie ante, a pellentesque dui."]
    [:p
     "Vivamus ullamcorper at orci ac tincidunt. Vivamus tincidunt sed erat nec consequat. Donec venenatis lorem justo, eget imperdiet arcu ultrices vitae. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec congue tempor posuere. Sed nec nisl mauris. Maecenas elementum quam justo, vitae auctor felis dapibus a. Phasellus leo justo, mattis a auctor tempus, facilisis vel tellus. Etiam at scelerisque justo, ac facilisis purus. Duis in leo pretium purus bibendum ultricies ac vitae lectus. Proin nec mi nec urna sollicitudin iaculis. In a orci felis. Sed luctus posuere luctus. Cras id euismod orci, id mollis nibh. Vestibulum et tellus quis lorem placerat scelerisque non et nisl. Ut dictum lacus nulla, sit amet ultricies eros pharetra vitae. "]
    [:p
     "Mauris ac nunc ligula. Nullam tincidunt fermentum tellus ac imperdiet. Suspendisse et accumsan augue, vitae efficitur mi. Nullam a tortor fringilla erat dapibus aliquet. Integer volutpat arcu nec quam dapibus, ut viverra ipsum vulputate. Quisque ut justo ut nisl suscipit finibus. Duis egestas enim quis ante porttitor malesuada. Phasellus scelerisque diam posuere pretium egestas."]]])



(defn top-banner-navigation
  "Top banner and navigation for the website"
  []
  [:section {:class "section hero is-small is-dark"}

   ;; Navigation bar (responsive)
   [:div {:class "navbar"}
    [:div {:class "container"}
     [:div {:class "navbar-brand"}
      [:a {:class "navbar-item"
           :href  "/"}
       [:img {:src "https://clojurebridge.org/community-docs/img/ClojureBridgeLogo.png"}]]
      [:span {:class       "navbar-burger burger"
              :data-target "navbarMenuHeroA"}
       ;; Empty spans needed for navbar burger
       [:span][:span][:span]]]
     [:div {:id    "navbarMenuHeroA"
            :class "navbar-menu"}
      [:div {:class "navbar-start"}
       [:a {:class "navbar-item"
            :href  "#overview"} "Overview"]
       [:a {:class "navbar-item"
            :href  "#showcase"} "Showcase"]
       [:a {:class "navbar-item"
            :href  "#workshops"} "Workshops"]
       [:a {:class "navbar-item"
            :href  "#install"} "Install"]
       [:a {:class "navbar-item"
            :href  "#resources"} "Resources"]
       [:a {:class "navbar-item"
            :href  "#resources"} "Coaches"]
       [:a {:class "navbar-item"
            :href "#sponsors"} "Sponsors"]
       [:span {:class "navbar-item"}
        [:a {:class "button is-inverted"
             :href  "https://github.com/clojurebridgelondon"}
         [:span {:class "icon"}
          [:i {:class "fab fa-github"}]]
         [:span "Issues/PRs"]]]]]]]

   ;; Tob banner title and subtitle
   [:div {:class "hero-body"}
    [:div {:class "container"}
     [:h1 {:class "title"}
      "ClojureBridge London"]
     [:p {:class "subtitle"}
      "Fun, Friendly, Free workshop for Women and non-binary genders"]]]

   ;; Footer with tabs to select specific content
   ;; An alternative to the above Navigation bar
   #_[:div {:class "hero-foot"}
      [:nav {:class "tabs"}
       [:div {:class "container"}
        [:ul
         [:li {:class "is-active"}
          [:a "Overview"]]
         [:li
          [:a "Showcase"]]
         [:li
          [:a "Workshops"]]
         [:li
          [:a "Install"]]
         [:li
          [:a "Next steps"]]
         [:li
          [:a "Coaches"]]
         [:li
          [:a "Sponsors"]]]]]]])


(defn main-page []
  [:div
   [top-banner-navigation]
   [lorem-ipsum]]

  ;; Top banner for the website
  )




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
