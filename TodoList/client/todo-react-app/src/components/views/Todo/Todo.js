import React from 'react'
import { Checkbox } from 'antd';
import 'antd/dist/antd.min.css'


function Todo(props) {
    return (
        <span>
            <Checkbox style={{padding:"10px 0 0 10px"}}> {props.item} </Checkbox>
        </span>
    )
}

export default Todo