import "../stories/atoms/button/button.css";
import "../stories/atoms/image/imageContent.css";
import "../stories/atoms/input/input.css";
import "../stories/atoms/label/label.css";
import "../stories/atoms/link/link.css";

import "../stories/molecules/ButtonGroup/ButtonGroup.css";
import "../stories/molecules/ImageBox/ImageBox.css";
import "../stories/molecules/SearchBox/SearchBox.css";
import "../stories/molecules/TextBox/TextBox.css";

import "../stories/organisms/article/Article.css";
import "../stories/organisms/Editor/MenuBar.scss";
import "../stories/organisms/Editor/MenuItem.scss";
import "../stories/organisms/Editor/styles.scss";
import "../stories/organisms/Header/Header.css";
import "../stories/organisms/LeftNav/LeftNav.css";
import "../stories/organisms/RightNav/RightNav.css";

import "../stories/pages/MainPage/MainPage.css";
import "../stories/pages/ReadOrWritePage/ReadOrWritePage.scss";

import type { AppProps } from "next/app";
import React from "react";
import Head from "next/head";

function MyApp({ Component, pageProps }: AppProps) {
  return (
    <>
      <Head>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>kiwi wiki</title>
      </Head>
      <Component {...pageProps} />
    </>
  );
}

export default MyApp;
