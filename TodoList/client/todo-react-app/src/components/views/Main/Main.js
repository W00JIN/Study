import React from 'react'
import { Layout } from 'antd'
import 'antd/dist/antd.min.css'
import NavBar from '../NavBar/NavBar'
import AddTodo from '../Todo/AddTodo'
import Todo from '../Todo/Todo'

const { Content } = Layout;

function Main(props) {
    return (

        <Layout className="layout" style={{ height: "100vh" }}>
            <NavBar/>
            <Content style={{ padding: '20px' }}>
                <div className="site-layout-content" style={{ backgroundColor:"white", height: "85vh" , padding: "30px", fontSize:"15pt"}}>
                    <div style={{margin:"auto", width :"500px"}}>
                        <AddTodo/>
                        <Todo item = "todo list" title = "add new"/>
                    </div>
                </div>
            </Content>
        </Layout>
        
    )
}

export default Main