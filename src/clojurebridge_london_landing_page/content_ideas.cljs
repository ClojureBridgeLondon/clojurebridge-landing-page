(ns clojurebridge-london-landing-page.content-ideas)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Content ideas and examples
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; Helper function: Generating content structure
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; write functions that generate boilerplate code such as unordered lists
;; Pass in a collection of list items

(defn unordered-list
  "Creates an unordered list from a collection of list item names.

  Each item in the list should be a string"
  [list-items]
  (into [:ul]
        (for [item list-items]
          [:li item])))

(unordered-list ["one" "two" "three"])


;; Using Tabs in the footer of a hero section
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

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


;; Content experiments
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Using media object for a social media layout approach
;; https://bulma.io/documentation/layout/media-object/
;; would need to have different size images for the various screen sizes (mobile, tablet, desktop)

(defn overview-media-object
  "Overview of ClojureBridge"
  []
  [:div {:class "container"
         :id    "overview"}
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
       ]]]]])


(defn schedule
  "Learning paths for Students of ClojureBridge"
  []
  [:div {:class "container"
         :id    "schedule"}
   [:div {:class "box"}
    [:article {:class "media"}
     [:div {:class "media-left"}
      [:figure {:class "image"}
       [:img {:src "https://clojure.org/images/clojure-logo-120b.png"}]]]
     [:div {:class "article-content"}
      [:div {:class "content"}
       [:h2 "ClojureBridge Schedule"]
       [:div {:class "columns"}
        [:div {:class "column is-half"}
         [:h3 "Friday Evening"]
         [:ul
          [:li
           [:strong "18:30: "] "Doors open & food"]
          [:li
           [:strong "19:00: "] "Introducing ClojureBridge & Clojure"]
          [:li
           [:strong "19:45: "] "Pair with Coach / choose a workshop"]
          [:li
           [:strong "20:30: "] "Wrap up"]]]
        [:div {:class "column"}
         [:h3 "Saturday"]
         [:ul
          [:li
           [:strong "10:30: "] "Doors open & breakfast"]
          [:li
           [:strong "11:00: "] "Workshop starts"]
          [:li
           [:strong "13:15: "] "Group Share - what have we learnt so far"]
          [:li
           [:strong "13:30: "] "Lunch"]
          [:li
           [:strong "14:30: "] "Continue workshop"]
          [:li
           [:strong "16:30: "] "Retrospective - capturing feedback"]
          [:li
           [:strong "17:00: "] "Wrap up"]]]]]]]]])



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



(defn hero-banner
  "Top banner and navigation for the website"
  []
  [:div {:class "hero is-small"}

   ;; Tob banner title and subtitle
   [:div {:class "hero-body"}
    [:div {:class "container"}
     [:h1 {:class "title"}
      "ClojureBridge London"]
     [:p {:class "subtitle"}
      "Fun, Friendly, Free workshop for Women and non-binary genders"]

     ;; call to register section
     ]]])



;; defining resources using the classic list
;; not as nice looking as using a table though
(defn resources-list
  "Useful resources during the workshop.

  Where to go next after the workshop."
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image"}
       [:img {:src "images/documentation.jpg"}]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Documentation"]
       [:ul
        [:li
         [:a {:href "https://clojuredocs.org/"} "Clojure docs"]
         " - docs for functions"]
        [:li
         [:a {:href "https://clojure.org/"} "Clojure.org"]
         " - home of Clojure"]
        [:li
         [:a {:href "https://clojure.org/"} "CljDocs"]
         " - search library docs"]]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Practising"]
       [:ul
        [:li
         [:a {:href "http://www.4clojure.com/"} "4Clojure"]
         " - exercise to learn Clojure functions"]
        [:li
         [:a {:href "https://exercism.io/tracks/clojure"} "Exercism"]
         " - Code practice and mentorship"]
        [:li
         [:a {:href "https://www.codewars.com/?language=clojure"} "Code Wars"]
         " - real coding challenges"]
        [:li
         [:a {:href "https://www.codingame.com/"} "CodinGame"]
         " - Practice & learn the fun way"]]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Online books"]
       [:ul
        [:li
         [:a {:href "https://github.com/clojure-cookbook/clojure-cookbook"} "Clojure Cookbook"]]
        [:li
         [:a {:href "http://practicalli.github.io/"} "Practicalli Clojure"]]
        [:li
         [:a {:href "http://funcool.github.io/clojurescript-unraveled/"} "ClojureScript Unraveled"]]
        [:li
         [:a {:href "https://www.braveclojure.com/clojure-for-the-brave-and-true/"} "Brave Clojure"]]]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Videos"]
       [:ul
        [:li
         [:a {:href "https://www.youtube.com/user/ClojureTV"} "Clojure TV"]
         " - conference talks"]
        [:li
         [:a {:href "https://www.youtube.com/watch?v=9A9qsaZZefw&list=PLAC43CFB134E85266"} "Clojure Language"]
         " - by Brian Will"]
        [:li
         [:a {:href ""} "Practicalli Clojure study group"]
         " - weekly practical lessons"]
        [:li
         [:a {:href "http://www.parens-of-the-dead.com/"} "Parens of the dead"]
         " - writing a card game in Clojure"]]]]]]])
