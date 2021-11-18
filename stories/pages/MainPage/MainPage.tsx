import React from "react";
// import "./MainPage.css";
import LeftNav from "../../organisms/LeftNav/LeftNav";
import RightNav from "../../organisms/RightNav/RightNav";
import Header from "../../organisms/Header/Header";
import Article from "../../organisms/article/Article";

interface MainPageProps {
  /**
   * React className 설정
   */
  className?: string[];

  /**
   * 클릭 핸들러
   */
  onClick?: () => void;

  /**
   * style 설정
   */
  style?: object;
}

const ButtongroupExample1 = [
  "Home",
  "Cloud",
  "Platform",
  "Connectors",
  "Tools",
  "Clients",
  "Login",
];




// const image = "/public/static/logos/logo.png";
const image = "/static/logos/logo.png";

/**
 * Primary UI component for user interaction
 */
const MainPage = ({ className, style, onClick }: MainPageProps) => (
  <div
    style={style}
    className={`main_structure_wholeBox ${className.join(" ")}`}
    onClick={onClick}
    aria-hidden="true"
  >
    <LeftNav image={image} />
    <div className="main_structure_rightBox">
      <Header buttons={ButtongroupExample1} />
      <div className="main_structure_rightBox_2">
        <Article />
        <RightNav />
      </div>
    </div>
  </div>
);

/**
 * react/require-default-props
 */
MainPage.defaultProps = {
  className: [],
  style: {},
  onClick: () => {},
};

export default MainPage;
