import React from "react";
import { ImageContent } from "../../atoms/image/ImageContent";
import ButtonGroup from "../../molecules/ButtonGroup/ButtonGroup";
// import "./LeftNav.css";

interface LeftNavProps {
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

  /**
   * image
   */
  image: string;
}

const buttonTitle = [
  "대문",
  "최근 바뀜",
  "요즘 화제",
  "기부",
  "사용자 모임",
  "관리 요청",
  "도움말",
  "정책과 지침",
  "질문방",
];

const buttonGroupClasses = ["button_leftNav"];

/**
 * Primary UI component for user interaction
 */
const LeftNav = ({ className, style, image, onClick }: LeftNavProps) => (
  <div
    style={style}
    className={`leftNav_default ${className.join(" ")}`}
    onClick={onClick}
    aria-hidden="true"
  >
    <div className="leftNav_topBox">
      <ImageContent
        src={image}
        alt="왼쪽 상단 이미지"
        className={["imageContent_default"]}
      />
    </div>
    <div className="leftNav_bottomBox">
      <ButtonGroup buttons={buttonTitle} className={buttonGroupClasses} />
    </div>
  </div>
);

/**
 * react/require-default-props
 */
LeftNav.defaultProps = {
  className: [],
  style: {},
  onClick: () => {},
};

export default LeftNav;
