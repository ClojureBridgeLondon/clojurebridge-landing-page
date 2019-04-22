(ns clojurebridge-london-landing-page.content)

;; Content for the ClojureBridge London website



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


(defn register
  "Component for signing up to the event, including the date of the current event"
  []
  [:div {:class "columns"}
   [:div {:class "column"}
    [:a {:class "button is-black is-medium is-outlined is-rounded"
         :href  "https://www.bridgetroll.org/events/471"}
     "Signup for the next event"]
    [:div {:class "column"}
     [:strong "10th/11th May 2019 @ Functional Works, London"]]]])


(defn overview
  "Overview of ClojureBridge"
  []
  [:section {:class "section"
             :id    "overview"}
   [:div {:class "container"}
    [:div {:class "box"}
     [:article {:class "media"}
      [:div {:class "media-left"}
       [:figure {:class "image"}
        [:img {:src "images/clojurebridge-diversity-2015.png"}]]]
      [:div {:class "article-content"}
       [:div {:class "content"}
        [:h2 "ClojureBridge overview "]
        [:p "Fun, free and friendly workshops for those identifying as women or non-binary gender."]
        [:p "Every student is paired with a coach who will support them through the workshop, helping them to relate to the concepts covered and
coaching them in the art of coding."]
        [:p "We teach students Clojure, a functional programming language that is great for beginners and experienced developers alike.  Find out " [:a {:href "#why-clojure"} "why Clojure is a great language to learn."]]
        [:p "Students can choose their own path in learning Clojure and we have put together content at different experience levels of experience."]
        ]]]]]])



(defn top-banner-navigation
  "Top banner and navigation for the website"
  []
  [:section {:class "section hero is-white is-small"}

   ;; Navigation bar (responsive)
   [:div {:class "navbar"}
    [:div {:class "container"}
     [:div {:class "navbar-brand"}
      [:a {:class "navbar-item"
           :href  "/"}
       [:img {:src "images/clojurebridge-logo.png"}]]
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
            :href  "#sponsors"} "Sponsors"]
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
      "Fun, Friendly, Free workshop for Women and non-binary genders"]
     [register]]]])


;; Footer with tabs to select specific content
;; An alternative to the above Navigation bar

;; [:div {:class "hero-foot"}
;;  [:nav {:class "tabs"}
;;   [:div {:class "container"}
;;    [:ul
;;     [:li {:class "is-active"}
;;      [:a "Overview"]]
;;     [:li
;;      [:a "Showcase"]]
;;     [:li
;;      [:a "Workshops"]]
;;     [:li
;;      [:a "Install"]]
;;     [:li
;;      [:a "Next steps"]]
;;     [:li
;;      [:a "Coaches"]]
;;     [:li
;;      [:a "Sponsors"]]]]]]
