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
