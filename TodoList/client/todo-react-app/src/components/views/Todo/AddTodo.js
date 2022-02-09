import React from 'react'
import {Input} from 'antd'
const {Search} = Input

class AddTodo extends React.Component{
    render() {
        return(
            <div>
                <Search
                    placeholder="새로운 리스트를 추가하세요"
                    allowClear
                    enterButton="Add"
                    style={{ width: "500px", marginLeft:"10px" }}
                />
            </div>
        )
    }
}
export default AddTodo