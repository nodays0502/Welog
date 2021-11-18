/* eslint-disable no-unused-vars */
import Head from "next/head";
import React from "react";
import { InferGetServerSidePropsType } from "next";
import LoginPage from "../stories/pages/AuthPage/login/LoginPage";

const Index = ({
  data,
}: InferGetServerSidePropsType<typeof getServerSideProps>) => (
  <>
    <Head>
      <title>kiwi-wiki</title>
    </Head>
    <LoginPage />
  </>
);

export const getServerSideProps = async () => ({
  props: {
    data: {},
  },
});

export default Index;
