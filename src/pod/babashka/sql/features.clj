(ns pod.babashka.sql.features
  {:no-doc true})

(def postgresql? (= (System/getenv "POD_DB_TYPE") "postgresql"))
(def hsqldb? (= (System/getenv "POD_DB_TYPE") "hsqldb"))
(def snowflake? (= (System/getenv "POD_DB_TYPE") "snowflake"))
