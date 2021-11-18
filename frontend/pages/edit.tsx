/* eslint-disable no-unused-vars */
import Head from "next/head";
import { InferGetServerSidePropsType } from "next";
import ReadOrWritePage from "../stories/pages/ReadOrWritePage/ReadOrWritePage";

const Edit = ({
  data,
}: InferGetServerSidePropsType<typeof getServerSideProps>) => (
  <div>
    <Head>
      <title>kiwi-wiki</title>
      <link
        href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css"
        rel="stylesheet"
      />
    </Head>
    <ReadOrWritePage />
  </div>
);

export const getServerSideProps = async () => ({
  props: {
    data: {},
  },
});

export default Edit;
