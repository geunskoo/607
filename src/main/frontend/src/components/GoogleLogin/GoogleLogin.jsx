import React from "react";
import axios from "axios";
import styles from "./GoogleLogin.module.css";

export default function GoogleLogin() {
  const handleClick = async () => {
    const res = await axios.get("/oauth2/authorization/google");
    const data = await res.data;
    console.log(data);
  };

  return (
    <button className={styles.button} onClick={handleClick}>
      Google Login
    </button>
  );
}
