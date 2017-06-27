/*
    配置信息
*/

const config = {

    // 默认菜单配置
    menus: [
        'head',
        'bold',
        'italic',
        'underline',
        'strikeThrough',
        'foreColor',
        'backColor',
        'link',
        'list',
        'justify',
        'quote',
        'emoticon',
        'image',
        'table',
        'video',
        'code',
        'undo',
        'redo'
    ],

    // 是否开启 debug 模式（debug 模式下错误会 throw error 形式抛出）
    debug: false,

    // onchange 事件
    // onchange: function (html) {
    //     // html 即变化之后的内容
    //     console.log(html)
    // },

    // 是否显示添加网络图片的 tab
    showLinkImg: true,

    // 默认上传图片 max size: 5M
    uploadImgMaxSize: 5 * 1024 * 1024,

    // 配置一次最多上传几个图片
    // uploadImgMaxLength: 5,

    // 上传图片，是否显示 base64 格式
    uploadImgShowBase64: false,

    // 上传图片，server 地址（如果有值，则 base64 格式的配置则失效）
    // uploadImgServer: '/upload',

    // 自定义配置 filename
    uploadFileName: '',

    // 上传图片的自定义参数
    uploadImgParams: {
        token: 'abcdef12345'
    },

    // 上传图片的自定义header
    uploadImgHeaders: {
        // 'Accept': 'text/x-json'
    },

    // 配置 XHR withCredentials
    withCredentials: false,

    // 自定义上传图片超时时间 ms
    uploadImgTimeout: 5000,

    // 上传图片 hook 
    uploadImgHooks: {
        // customInsert: function (insertLinkImg, result, editor) {
        //     // 图片上传并返回结果，自定义插入图片的事件，而不是编辑器自动插入图片
        //     const data = result.data || []
        //     data.forEach(link => {
        //         insertLinkImg(link)
        //     })
        // },
        before: function (xhr, editor, files) {
            // 图片上传之前触发
        },
        success: function (xhr, editor, result) {
            // 图片上传并返回结果，图片插入成功之后触发
        },
        fail: function (xhr, editor, result) {
            // 图片上传并返回结果，但图片插入错误时触发
        },
        error: function (xhr, editor) {
            // 图片上传出错时触发
        },
        timeout: function (xhr, editor) {
            // 图片上传超时时触发
        }
    }
}

export default config