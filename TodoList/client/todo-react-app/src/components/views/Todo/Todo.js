import React from 'react'
import { Checkbox } from 'antd';
import { EditOutlined, DeleteOutlined } from '@ant-design/icons';
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
            <div style={{padding:"15px 0px 0 10px"}}>
                <Checkbox> 
                    <span>{this.state.item.title}</span> 
                </Checkbox>

                <span style={{float : "right"}}>
                        <EditOutlined style={{color:"#08c"}}/>
                        <DeleteOutlined style={{paddingLeft:"13px", color:"#eb2f96"}}/>
                    </span> 
            </div>
        )
    }
}

export default Todo
