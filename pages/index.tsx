/* eslint-disable no-unused-vars */
import Head from "next/head";
import { InferGetServerSidePropsType } from "next";
import MainPage from "../stories/pages/MainPage/MainPage";

const Index = ({
  data,
}: InferGetServerSidePropsType<typeof getServerSideProps>) => (
  <>
    <Head>
      <title>kiwi-wiki</title>
    </Head>
    <MainPage />
  </>
);

export const getServerSideProps = async () => ({
  props: {
    data: {},
  },
});

export default Index;
