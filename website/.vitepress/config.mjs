import { defineConfig } from 'vitepress'

// https://vitepress.dev/reference/site-config
export default defineConfig({
  title: "Element-FX",
  description: "element-plus for JavaFX",
  base: '/Element-FX',
  themeConfig: {
    // https://vitepress.dev/reference/default-theme-config
    nav: [
      { text: '主页', link: '/' },
      { text: '示例', link: '/markdown-examples' }
    ],

    sidebar: [
      {
        text: '介绍',
        link: '/introduce'
      },
      {
        text: '安装',
        link: '/setup'
      },
      {
        text: '示例',
        items: [
          { text: 'Markdown Examples', link: '/markdown-examples' },
          { text: 'Runtime API Examples', link: '/api-examples' }
        ]
      },
      {
        text: 'CHANGELOG',
        link: '/CHANGELOG'
      },
    ],

    socialLinks: [
      { icon: 'github', link: 'https://github.com/lzw-723/Element-FX' },
      { icon: 'author', link: 'https://blog.lzwi.fun' }
    ]
  }
})
