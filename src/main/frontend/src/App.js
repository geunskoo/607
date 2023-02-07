import logo from "./logo.svg";
import "./App.css";
import { useEffect, useState } from "react";
import axios from "axios";

function App() {
    const [text, setText] = useState('');
    const handleClick1 = async () => {
        const res = await axios.get('/test1');
        const data = await res.data;
        console.log(data);
        setText(data)
    }
    const handleClick2 = async () => {
        const res = await axios.get('/test2');
        const data = await res.data;
        console.log(data);
        setText(data)
    }

  return (
    <div className="App">
      <button onClick={handleClick1}>test1</button>
      <button onClick={handleClick2}>test2</button>
        <span>{text}</span>
    </div>
  );
}

export default App;
