import React from 'react'
import { DownCircleOutlined } from '@ant-design/icons';
import { Layout, Input } from 'antd';
import 'antd/dist/antd.css';
import NavBar from '../NavBar/NavBar';

const { Content } = Layout;
const { Search } = Input;

function Todo(props) {
    return (

        <Layout className="layout">
            <NavBar/>

            <Content style={{ padding: '20px' }}>
                
                <div className="site-layout-content" style={{textAlign: "center", backgroundColor:"white", height: "80vh" , padding: "30px", fontSize:"15pt"}}>
         
                        <DownCircleOutlined style={{color:'#08c'}}/>
                        <Search
                          placeholder="새로운 리스트를 추가하세요"
                          allowClear
                          enterButton="Search"
                          style={{ width: 304, marginLeft:"10px" }}
                        />

                </div>
            </Content>


        </Layout>
        
    )
}

export default Todo