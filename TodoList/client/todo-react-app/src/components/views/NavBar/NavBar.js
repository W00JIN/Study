import React from 'react'
import { Layout } from 'antd';
import { SmileTwoTone } from '@ant-design/icons';
const { Header } = Layout;

class NavBar extends React.Component{
    render() {
        return(
            <Header>
                <div className="logo" />
                <div theme="dark" mode="horizontal" fontSize = "100pt" style={{color:'white', fontSize:"15pt"}}>
                    
                    <span >To Do List </span>
                    <SmileTwoTone/>
                    
                </div>
            </Header>
        )
    }
}

export default NavBar