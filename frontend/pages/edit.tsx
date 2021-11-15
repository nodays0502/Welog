import Head from "next/head";
import ReadOrWritePage from "../stories/pages/ReadOrWritePage/ReadOrWritePage";

const Edit = () => (
  <div>
    <Head>
      <title>test</title>
      <link
        href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css"
        rel="stylesheet"
      />
    </Head>
    <ReadOrWritePage />
  </div>
);

export default Edit;
