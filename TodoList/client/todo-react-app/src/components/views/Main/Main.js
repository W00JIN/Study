import React from 'react'
import { Layout, List } from 'antd'
import 'antd/dist/antd.min.css'
import NavBar from '../NavBar/NavBar'
import AddTodo from '../Todo/AddTodo'
import Todo from '../Todo/Todo'

const { Content } = Layout;


class Main extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            items : []
        }
    }
    addTodo = (item) => {
        const thisItems = this.state.items
        item.id = "ID-" + thisItems.length
        item.done = false
        thisItems.push(item)
        this.setState({ items : thisItems })
        console.log("items : ", this.state.items)
    }
    render() {
        var todoItems = this.state.items.length>0 && (
            <List>
                {this.state.items.map((item,idx)=>(
                    <Todo key={item.id} item={item}/>
                ))}
            </List>
        )

        return(
            <Layout className="layout" style={{ height: "100vh" }}>
                <NavBar/>
                <Content style={{ padding: '20px' }}>
                    <div className="site-layout-content" style={{ backgroundColor:"white", height: "85vh" , padding: "30px", fontSize:"15pt"}}>
                        <div style={{margin:"auto", width :"500px"}}>
                            <AddTodo addTodo={this.addTodo}/>
                            <div>
                                {todoItems}
                            </div>
                        </div>
                    </div>
                </Content>
            </Layout>
        )
    }
}
export default Main