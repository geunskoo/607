import logo from "./logo.svg";
import "./App.css";
import { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [hello, setHello] = useState("");

  useEffect(() => {
    axios
      .get("/hello")
      .then((res) => setHello(res.data))
      .catch(console.log);
  }, []);
  return (
    <div className="App">
      <p>{hello}</p>
    </div>
  );
}

export default App;
