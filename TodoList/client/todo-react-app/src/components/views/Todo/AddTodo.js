import React from 'react'
import {Input} from 'antd'
const {Search} = Input

class AddTodo extends React.Component{
    constructor(props){
        super(props)
        this.state = { item: { title : "" } }
        this.addTodo = props.addTodo
    }
    onInputChange = (e) => {
        const thisItem = this.state.item
        thisItem.title = e.target.value
        this.setState({item : thisItem})
    }
    onButtonClick = () => {
        this.addTodo(this.state.item)
        this.setState({ item: { title : "" } })
    }
    render() {
        return(
            <div>
                <Search
                    placeholder="새로운 리스트를 추가하세요"
                    allowClear
                    enterButton="Add"
                    style={{ width: "500px", marginLeft:"10px" }}
                    onChange={this.onInputChange}
                    value = {this.state.item.title}
                    onSearch={this.onButtonClick}
                />
            </div>
        )
    }
}
export default AddTodo