import React from "react";
// import "./Article.css";
import TextBox from "../../molecules/TextBox/TextBox";

interface ArticleProps {
  /**
   * React className 설정
   */
  className?: string[];

  /**
   * style 설정
   */
  style?: object;
}

/**
 * Primary UI component for user interaction
 */
const Article = ({ className, style }: ArticleProps) => (
  <div style={style} className={`article_default ${className.join(" ")}`}>
    <TextBox text="kiwi wiki" />
    <TextBox text="키위 위키는 거꾸로 해도 키위위키" />
  </div>
);

/**
 * Header 기본 props 설정
 */
Article.defaultProps = {
  className: [],
  style: {},
};

export default Article;
