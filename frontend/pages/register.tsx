/* eslint-disable no-unused-vars */
import Head from "next/head";
import React from "react";
import { InferGetServerSidePropsType } from "next";
import RegisterPage from "../stories/pages/AuthPage/register/RegisterPage";

const Index = ({
  data,
}: InferGetServerSidePropsType<typeof getServerSideProps>) => (
  <>
    <Head>
      <title>kiwi-wiki</title>
    </Head>
    <RegisterPage />
  </>
);

export const getServerSideProps = async () => ({
  props: {
    data: {},
  },
});

export default Index;
