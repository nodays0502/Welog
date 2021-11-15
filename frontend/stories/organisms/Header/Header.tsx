import React from "react";
// import "./Header.css";
import ButtonGroup from "../../molecules/ButtonGroup/ButtonGroup";
import SearchBox from "../../molecules/SearchBox/SearchBox";

interface HeaderProps {
  /**
   * React className 설정
   */
  className?: string[];

  /**
   * style 설정
   */
  style?: object;

  /**
   * buttons 항목 설정
   */
  buttons: string[];
}

/**
 * Primary UI component for user interaction
 */
const Header = ({ className, style, buttons }: HeaderProps) => (
  <div style={style} className={`header_default ${className.join(" ")}`}>
    <SearchBox />
    <ButtonGroup buttons={buttons} />
  </div>
);

/**
 * Header 기본 props 설정
 */
Header.defaultProps = {
  className: [],
  style: {},
};

export default Header;
