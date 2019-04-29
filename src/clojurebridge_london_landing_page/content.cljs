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
      [:div {:class "content"}
       [:h2 "Documentation"]
       [:ul
        [:li
         [:a {:href "https://clojuredocs.org/"} "Clojure docs"]
         " - documentation and examples"]
        [:li
         [:a {:href "https://clojure.org/"} "Clojure.org"]]]]]

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
       [:p "Not sure you are experienced enough? Take a look at the exercises we use in our workshops"]]]

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
  [:div {:class "container"
         :id    "sponsors"}
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
         [:strong "Absolute Beginner"] " - have a conversation with your computer using colours and shapes"]
        [:li
         [:strong "A little coding experience"] " - tackle some simple challenges"]
        [:li
         [:strong "Some experience coding"] " - build a website, app or game with a coach"]]

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
       [:p "Examples of just what Clojure can do"]]]]]])


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
     [:p "Coach training 2nd May"]]]])


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
