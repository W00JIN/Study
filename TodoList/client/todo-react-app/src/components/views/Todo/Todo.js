import React from 'react'
import { Checkbox } from 'antd';
import 'antd/dist/antd.min.css'


class Todo extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            item : props.item
        }
    }
    render() {
        return(
            <span>
                <Checkbox style={{padding:"10px 0 0 10px"}}> {this.state.item.title} </Checkbox>
            </span>
        )
    }
}

export default Todo