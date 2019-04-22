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
