(ns beer-song)
(require '[clojure.string :as string])

(defn n-bottles
  [n]
  (cond (= n 0) "no more bottles"
    (= n 1) "1 bottle"
    :else (format "%d bottles" n)))

(defn first-line
  [n]
  (let [formatted-bottles (n-bottles n)]
    (format "%s of beer on the wall, %s of beer." (string/capitalize formatted-bottles) formatted-bottles)))

(defn pass-or-buy
  [n]
  (cond (= n 0) "Go to the store and buy some more,"
    (= n 1) "Take it down and pass it around,"
    :else "Take one down and pass it around,"))

(defn verse
  [n]
  )

(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start])
  ([start end]))
