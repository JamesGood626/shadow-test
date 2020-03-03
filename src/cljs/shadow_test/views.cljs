(ns shadow-test.views
  (:require
   [re-frame.core :as re-frame]
   [shadow-test.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     [:div
      [:div [:h2 "Deploy this B."]]]
     ]))
