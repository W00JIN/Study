import React from 'react'
import { Layout } from 'antd'
import 'antd/dist/antd.min.css'
import NavBar from '../NavBar/NavBar'
import AddTodo from '../Todo/AddTodo'
import Todo from '../Todo/Todo'

const { Content } = Layout;


class Main extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            item : {id:0, title : "첫 번째 투두리스트", done : true},
        }
    }
    render() {
        return(
            <Layout className="layout" style={{ height: "100vh" }}>
                <NavBar/>
                <Content style={{ padding: '20px' }}>
                    <div className="site-layout-content" style={{ backgroundColor:"white", height: "85vh" , padding: "30px", fontSize:"15pt"}}>
                        <div style={{margin:"auto", width :"500px"}}>
                            <AddTodo/>
                            <Todo item = {this.state.item}/>
                        </div>
                    </div>
                </Content>
            </Layout>
        )
    }
}
export default Main