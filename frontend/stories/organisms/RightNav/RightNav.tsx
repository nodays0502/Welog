import React from "react";
// import "./RightNav.css";
import TextBox from "../../molecules/TextBox/TextBox";

interface RightNavProps {
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

/**
 * Primary UI component for user interaction
 */
const RightNav = ({ className, style, onClick }: RightNavProps) => (
  <div
    style={style}
    className={` rightNav_default ${className.join(" ")}`}
    onClick={onClick}
    aria-hidden="true"
  >
    <TextBox text="카테고리 내 연관 페이지" />
    <TextBox text="테스트 문구" />
  </div>
);

/**
 * react/require-default-props
 */
RightNav.defaultProps = {
  className: [],
  style: {},
  onClick: () => {},
};

export default RightNav;
