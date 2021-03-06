import React from "react";
// import "./ReadOrWritePage.scss";
import LeftNav from "../../organisms/LeftNav/LeftNav";
import RightNav from "../../organisms/RightNav/RightNav";
import Header from "../../organisms/Header/Header";
import Editor from "../../organisms/Editor/index";
import ButtonGroup from "../../molecules/ButtonGroup/ButtonGroup";

interface ReadOrWritePageProps {
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

const editButtons = ["등록", "수정"];
/**
 * Primary UI component for user interaction
 */
const ReadOrWritePage = ({
  className,
  style,
  onClick,
}: ReadOrWritePageProps) => (
  <div
    style={style}
    className={`ReadOrWritePage_structure_wholeBox ${className.join(" ")}`}
    onClick={onClick}
    aria-hidden="true"
  >
    <LeftNav image={image} />
    <div className="ReadOrWritePage_structure_rightBox">
      <Header buttons={ButtongroupExample1} />
      <div className="ReadOrWritePage_structure_rightBox_2">
        <div className="ReadOrWritePage_structure_leftBox_2">
          <Editor />
          <ButtonGroup buttons={editButtons} className={["buttons_edit"]} />
        </div>

        <RightNav />
      </div>
    </div>
  </div>
);

/**
 * react/require-default-props
 */
ReadOrWritePage.defaultProps = {
  className: [],
  style: {},
  onClick: () => {},
};

export default ReadOrWritePage;
