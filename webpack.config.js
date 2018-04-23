var debug = process.env.NODE_ENV !== "production";
var webpack = require('webpack');

module.exports = {
    mode: 'production',
    context: __dirname,
    devtool: debug ? "inline-sourcemap" : null,
    entry: "./Cotizacion_MyC-war/resources/assets/js/admin.js",
    output: {
        path: __dirname + "/Cotizacion_MyC-war/web/js",
        filename: "admin.js"
    },
    module: {
        rules: [
            {
                test: /\.(scss)$/,
                use: [
                    {
                        // Adds CSS to the DOM by injecting a `<style>` tag
                        loader: 'style-loader'
                    },
                    {
                        // Interprets `@import` and `url()` like `import/require()` and will resolve them
                        loader: 'css-loader'
                    },
                    {
                        // Loader for webpack to process CSS with PostCSS
                        loader: 'postcss-loader',
                        options: {
                            plugins: function () {
                                return [
                                    require('autoprefixer')
                                ];
                            }
                        }
                    },
                    {
                        // Loads a SASS/SCSS file and compiles it to CSS
                        loader: 'sass-loader'
                    }
                ]
            }
        ]
    },
    plugins: debug ? [] : [
        new webpack.optimize.DedupePlugin(),
        new webpack.optimize.OccurenceOrderPlugin(),
        new webpack.optimize.UglifyJsPlugin({mangle: false, sourcemap: false}),
    ],
    performance: {
        hints: process.env.NODE_ENV === 'production' ? false : false
    },
};