import React, { useState } from 'react';

const Form = () => {
  const [color, setColor] = useState('');
  const [boxes, setBoxes] = useState([]);

  const handleColorChange = (event) => {
    setColor(event.target.value);
  };

  const addBox = (event) => {
    event.preventDefault();
    if (color.trim() === '') return;

    const newBox = {
      color: color,
      id: Math.random().toString(36).substr(2, 9),
    };

    setBoxes([...boxes, newBox]);
    setColor('');
  };

  return (
    <div className='box'>
      <form onSubmit={addBox}>
        <label htmlFor="colorInput">
          Color:
          <input
            type="text"
            id="colorInput"
            value={color}
            onChange={handleColorChange}
            aria-label="Color Input"
          />
        </label>

        <button type="submit">Add</button>
      </form>

      <div className="box-container">
        {boxes.map((box) => (
          <div
            key={box.id} 
            className="color-box"
            style={{
            //   display,
              backgroundColor: box.color,
              margin: '5px',
              width: '300px',
              height: '300px',
            //   flex-wrap: wrap,
              
            }}
          ></div>
        ))}
      </div>
    </div>
  );
};

export default Form;
