import React from "react";
import { FindIconButton } from "../../atoms/button/Button";
import Input from "../../atoms/input/Input";
// import "./SearchBox.css";

interface SearchBoxProps {
  /**
   * className 설정
   */
  className?: string[];

  /**
   * style 정의
   */
  style?: object;
}

const SearchBox = ({ style, className }: SearchBoxProps) => (
  <div style={style} className={`searchBox_default ${className.join(" ")}`}>
    <Input placeHolder="Search Documentation" />
    <FindIconButton className="findIconButton_default" />
  </div>
);

/**
 * react/require-default-props
 */
SearchBox.defaultProps = {
  style: {},
  className: [],
};

export default SearchBox;
