FROM node:16.6.1-alpine3.13
WORKDIR /app
COPY . .
ENV NODE_ENV production 
RUN addgroup -g 1001 -S nodejs
RUN adduser -S nextjs -u 1001
RUN chown -R nextjs:nodejs /app/.next
RUN chown -R nextjs:nodejs /app/.yarn
RUN echo "YARN VERSION IN RUNNER: " && yarn --version
USER nextjs
EXPOSE 3000
ENV PORT 3000
RUN yarn next build
CMD ["yarn","next","start"]