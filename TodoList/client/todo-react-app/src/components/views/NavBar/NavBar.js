import React from 'react'
import { Layout, Typography } from 'antd';
import { HeartTwoTone } from '@ant-design/icons';
const { Header } = Layout;
const { Text } = Typography;


function NavBar(props) {
    return (

        <Header>
            <div className="logo" />
            <div theme="dark" mode="horizontal" font-size = "100pt" style={{color:'white', fontSize:"15pt"}}>
                
                <span >To Do List </span>
                <HeartTwoTone/>
                
            </div>
        </Header>

    )
}

export default NavBar