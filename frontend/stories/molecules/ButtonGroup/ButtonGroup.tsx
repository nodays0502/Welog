import React from "react";
import { useRouter } from 'next/router';
import Button from "../../atoms/button/Button";
// import "./ButtonGroup.css";

interface ButtonGroupProps {
  /**
   * className 설정
   */
  className?: string[];

  /**
   * style 정의
   */
  style?: object;

  /**
   * Buttons 정리
   */
  buttons?: string[];
}

// const authButtonType = {
//   'login': 'auth/post',
//   'logout': 'auth/delete',
// };

// const clientButtonType = {
//   'register': 'user/post',
//   'secession': 'user/delete',
//   'lookup': 'user/get',
//   'change': 'user/patch',
// };

// const articleButtonType = {
//   'register': 'board/post',
//   'lookup': 'board/get',
//   'lookupDetail': 'board/get',
//   'change': 'board/patch',
//   'delete': 'board/delete',
//   'lookupfavorite': 'board/favorite/get',
//   'addfavorite': 'board/favorite/post',
//   'deletefavorite': 'board/favorite/delete'
// };

// const commentButtonType = {
//   'register': 'comment/post',
//   'lookup': 'comment/get',
//   'change': 'comment/patch',
//   'delete': 'comment/delete',
//   'patch': 'comment/patch'
// };

// const managerButtonType = {
//   'delete': 'admin/user/delete',
//   'change': 'admin/user/patch',
//   'lookupAllClients': 'admin/user/get',
//   'lookupEmailClients': 'admin/user/get',
//   'changePrivilege': 'admin/board/patch',
//   'rollback': 'admin/board/patch'
// };

// const ButtongroupExample1 = [
//   "Home",
//   "Cloud",
//   "Platform",
//   "Connectors",
//   "Tools",
//   "Clients",
//   "Login",
// ];

export const goHome = (router) => {
  router.push('/');
}
 
export const goRegister = (router) => {
  router.push('/register');
}
export const goLogin = (router) => {
  router.push('/login');
}

const ButtonGroup = ({ style, className, buttons }: ButtonGroupProps) => {
  
  const router = useRouter();
  
  return (<div style={style} className={`buttonGroup_default ${className.join(" ")}`}>
    {buttons.map((button) => {
     
      if (button === "Home") {
        return <Button label={button} key={button} onClick={()=>goHome(router)} />
      }
      if(button === "Login") {
        return <Button label={button} key={button} onClick={()=>goLogin(router)}/>
      }
      if(button === "Login") {
        return <Button label={button} key={button} />
      }
      
        return <Button label={button} key={button} />
    })}
  </div>
);
  }

/**
 * react/require-default-props
 */
ButtonGroup.defaultProps = {
  style: {},
  className: [],
  buttons: [],
};
export default ButtonGroup;
