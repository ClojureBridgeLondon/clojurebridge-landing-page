(ns clojurebridge-london-landing-page.content)

;; Content for the ClojureBridge London website

(defn resources
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
      [:h4 {:class "title is-4"} "Documentation"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://clojuredocs.org/"} "Clojure docs"]]
         [:td "docs for functions"]]
        [:tr
         [:th
          [:a {:href "https://clojure.org/"} "Clojure.org"]]
         [:td "language and concepts"]]
        [:tr
         [:th
          [:a {:href "https://clojure.org/"} "CljDocs"]]
         [:td "search library docs"]]]]]

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Practising"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "http://www.4clojure.com/"} "4Clojure"]]
         [:td "learn Clojure functions"]]
        [:tr
         [:th
          [:a {:href "https://exercism.io/tracks/clojure"} "Exercism"]
          ]
         [:td "code practice & mentorship"]]
        [:tr
         [:th
          [:a {:href "https://www.codewars.com/?language=clojure"} "Code Wars"]]
         [:td "real coding challenges"]]
        [:tr
         [:th
          [:a {:href "https://www.codingame.com/"} "CodinGame"]]
         [:td "practice & learn the fun way"]]]]]

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Online books"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://github.com/clojure-cookbook/clojure-cookbook"} "Clojure Cookbook"]]]
        [:tr
         [:th
          [:a {:href "http://practicalli.github.io/"} "Practicalli Clojure"]]]
        [:tr
         [:th
          [:a {:href "http://funcool.github.io/clojurescript-unraveled/"} "ClojureScript Unraveled"]]]
        [:tr
         [:th
          [:a {:href "https://www.braveclojure.com/clojure-for-the-brave-and-true/"} "Brave Clojure"]]]]]]

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Videos"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://www.youtube.com/user/ClojureTV"} "Clojure TV"]]
         [:td "conference talks"]]
        [:tr
         [:th
          [:a {:href "https://www.youtube.com/watch?v=9A9qsaZZefw&list=PLAC43CFB134E85266"} "Clojure Language"]]
         [:td "describing language concepts"]]
        [:tr
         [:th
          [:a {:href "https://www.youtube.com/watch?v=MZcuL4lRw5E&list=PLy9I_IfUBzKJSgctCJaRYcnF6kZdiZ5ku"} "Practicalli study group"]]
         [:td "weekly practical lessons"]]
        [:tr
         [:th
          [:a {:href "http://www.parens-of-the-dead.com/"} "Parens of the dead"]]
         [:td "a card game in Clojure"]]]]]]]])


(defn coaches
  "Details for coaches.

  Coach training.
  Expectations."
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}

     [:div {:class "column"}
      [:figure {:class "image"}
       [:img {:src "images/coaching.png"}]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Coaches Guide"]
       [:p "Coaching is incredibly rewarding and a great way to embed your understanding of Clojure"]
       [:p "Not sure you are experienced enough? Take a look at the exercises we use in our workshops"]
       [:p "All coaches agree to abide by the code of conduct"]
       [:p "A coach training session is run before the main event, enabling you to practice coaching. "
        [:strong "Please bring your laptop to the coach training"]]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Coach Resources"]
       [:p
        [:a {:href "https://www.youtube.com/watch?v=cZdo_vYvd8M"}
         "Coach training video"]]
       [:p
        [:a {:href "https://docs.google.com/presentation/d/e/2PACX-1vR_RYp1Vq9O75hmjG-SWRjtr8zezF8CUXicIOSkJqJf-U512u9E7SZm0UCzcIxqbia1VWObchTx9e-L/pub?start=false&loop=false&delayms=3000"}
         "Coach readiness presentation"]]]]]]])



(defn sponsor-current
  "Sponsors for our current event, to help that sponsor get some exposure

  Argument: hash-map of strings - :name, :website, :logo, :message"
  [sponsor-details]
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "column is-half is-8 is-offset-2"}
     [:a {:href (get sponsor-details :website)}
      [:h3 {:class "title is-5 has-text-centered"} (str "Our Sponsors:" " " (get sponsor-details :name))]]
     [:div {:class "columns"}
      [:div {:class "column"}
       [:figure {:class "image"}
        [:a {:href (get sponsor-details :website)}
         [:img {:src "images/functional-works-logo.png"}]]]]
      [:div {:class "column"}
       [:div {:class "content"}
        [:p (get sponsor-details :message)]]]]]]])



(defn sponsors
  "How to sponsor us.
  All our sponsors past and present"
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image"}
       [:img {:src "images/functional-works-logo.png"}]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Sponsoring ClojureBridge London"]
       [:p "How to get involved as a sponsor"]]]]]])


(defn install
  "How to install Clojure on your computer

  TODO: add a selector for operating system and only show the relevant content"
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image"}
       [:a {:href   "https://clojurebridgelondon.github.io/workshop/development-tools/"
            :target "_blank"}
        [:img {:src "images/clojurebridge-install.png"}]]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:a {:href   "https://clojurebridgelondon.github.io/workshop/development-tools/"
            :target "_blank"}
        [:h2 "Clojure Install"]]
       [:p "If you are taking the learning path to build a website, game or app
           (or wish to do so after the event),
           then you should install Clojure on your laptop"]
       [:p "The "
        [:a {:href   "https://clojurebridgelondon.github.io/workshop/development-tools/"
             :target "_blank"}
         "Clojure development environment guides"]
        " show you how to do this for Linux, MacOSX and Windows."]]]]]])


(defn learning-paths
  "Learning paths for Students of ClojureBridge"
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image"}
       [:img {:src "images/learning-paths-banner.jpg"}]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Learning Paths"]
       [:p "Students can choose their own path in learning Clojure and we have put together content at three different levels"]
       [:ul
        [:li
         [:strong
          [:a {:href "/workshop/colours-and-shapes/"} "Colours and Shapes in Clojure"]] " - essentials of coding by creating shapes and simple animated pictures"]
        [:li
         [:strong
          [:a {:href "/workshop/clojure-essentials.html"}  "Clojure essentials"]] " - learn the language and tackle some simple challenges"]
        [:li
         [:strong
          [:a {:href "/workshop/challenges-projects.html"} "Challenges and projects"]] " - create a dynamic website, animation or interactive game"]]
       [:p "Every student is paired with a coach who will support them through the workshop, helping them to relate to the concepts covered and
coaching them in the art of coding."]
       ]]]]])



(defn showcase
  "Learning paths for Students of ClojureBridge

  container style adds left/right margin
  box add shadow and padding around content"
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image is-128x128"}
       [:img {:src "https://clojure.org/images/clojure-logo-120b.png"}]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Clojure Showcase"]
       [:p
        [:a {:href   "https://clojurebridgelondon.github.io/workshop/introducing-clojure/"
             :target "_blank"}
         "Examples of just what Clojure can do"]]]]]]])


(defn schedule
  "Learning paths for Students of ClojureBridge"
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image is-128x128"}
       [:img {:src "images/clock.jpg"}]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "ClojureBridge Schedule"]
       [:h3 "Friday Evening"]
       [:ul
        [:li
         [:strong "18:30: "] "Doors open & food"]
        [:li
         [:strong "19:00: "] "Introducing ClojureBridge & Clojure"]
        [:li
         [:strong "19:45: "] "Pair with Coach / choose a workshop"]
        [:li
         [:strong "20:30: "] "Wrap up"]]]]

     [:div {:class "column"}
      [:div {:class "content"}
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
         [:strong "17:00: "] "Wrap up"]]]]]]])


(defn level-separator
  "A separator to provide a gap between components.
  The separator takes an id so that the section
  does not get hidden by the menu when linking"
  [identifier]
  [:div {:class "level"
         :id    identifier}
   [:h5 {:class "is-size-5 is-invisible"}
    identifier]])



(defn overview
  "Overview of ClojureBridge"
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image"}
       [:img {:src "images/clojurebridge-diversity-2015.png"}]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "ClojureBridge overview "]
       [:p "Fun, free and friendly workshops for those identifying as women or non-binary gender."]
       [:p "Every student is paired with a coach who will support them through the workshop, helping them to relate to the concepts covered and
coaching them in the art of coding."]
       [:p "We teach students Clojure, a functional programming language that is great for beginners and experienced developers alike.  Find out " [:a {:href "#why-clojure"} "why Clojure is a great language to learn."]]
       [:p "Students can choose their own path in learning Clojure and we have put together content at different experience levels of experience."]
       ]]]]])


(defn navigation-top
  ""
  []
  ;; Navigation bar (responsive)
  [:nav {:class      "navbar is-fixed-top is-dark"
         :role       "navigation"
         :aria-label "main navigation"}
   [:div {:class "container"}
    [:div {:class "navbar-brand"}
     [:a {:class "navbar-item"
          :href  "/"}
      [:img {:src "images/clojurebridge-logo.png"}]]
     [:span {:class       "navbar-burger burger"
             :data-target "navbarClojureBridge"}
      ;; Empty spans needed for navbar burger
      [:span][:span][:span]]]
    [:div {:id    "navbarClojureBridge"
           :class "navbar-menu"}
     [:div {:class "navbar-start"}
      [:a {:class "navbar-item"
           :href  "#overview"} "Overview"]
      [:a {:class "navbar-item"
           :href  "#showcase"} "Showcase"]
      [:a {:class "navbar-item"
           :href  "#learning-paths"} "Learning Paths"]
      [:a {:class "navbar-item"
           :href  "#schedule"} "Schedule"]
      [:a {:class "navbar-item"
           :href  "#install"} "Install"]
      [:a {:class "navbar-item"
           :href  "#resources"} "Resources"]
      [:a {:class "navbar-item"
           :href  "#resources"} "Coaches"]
      [:a {:class "navbar-item"
           :href  "#sponsors"} "Sponsors"]
      [:span {:class "navbar-item"}
       [:a {:class  "button is-inverted"
            :target "_blank"
            :href   "https://github.com/ClojureBridgeLondon/landing-page-draft"}
        [:span {:class "icon"}
         [:i {:class "fab fa-github"}]]
        [:span "Issues/PRs"]]]]]]]
  )

(defn- register
  "Component for signing up to the event, including the date of the current event"
  []
  [:div {:class "columns"}
   [:div {:class "column"}
    [:a {:class "button is-success is-large is-rounded"
         :href  "https://www.bridgetroll.org/events/471"}
     "Signup for the next event"]
    [:div {:class "column"}
     [:strong "10th/11th May 2019 @ Functional Works, London"]
     [:p "Coach training 2nd May"]
     [:p
      [:a {:href "https://www.youtube.com/watch?v=HOzx9U9SI_4"}
       "Broadcast: Friday evening introduction"]]]]])


(defn banner-columns
  "Top banner and navigation for the website"
  []
  [:section {:class "section"}
   [:div {:class "container"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:h1 {:class "title"}
       "ClojureBridge London"]
      [:p {:class "subtitle"}
       "Fun, Friendly, Free workshop for Women* and non-binary genders"]
      [:p {:class "subtitle is-6"}
       "* any person who self-identifies as a woman"]]
     [:div {:class "column"}
      [register]]]]])
