package com.cn.interfacedocument.qrcode.wrapper;

import com.google.zxing.EncodeHintType;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qsj on 2018/12/5.
 */
@Data
public class QrCodeOptions {
    /**
     * 塞入二维码的信息
     */
    private String msg;

    /**
     * 生成二维码的宽
     */
    private Integer w;


    /**
     * 生成二维码的高
     */
    private Integer h;


    /**
     * 二维码信息(即传统二维码中的黑色方块) 绘制选项
     */
    private DrawOptions drawOptions;


    /**
     * 背景图样式选项
     */
    private BgImgOptions bgImgOptions;

    /**
     * logo 样式选项
     */
    private LogoOptions logoOptions;


    /**
     * todo 后续可以考虑三个都可以自配置
     * <p>
     * 三个探测图形的样式选项
     */
    private DetectOptions detectOptions;


    private Map<EncodeHintType, Object> hints;


    /**
     * 生成二维码图片的格式 png, jpg
     */
    private String picType;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public DrawOptions getDrawOptions() {
        return drawOptions;
    }

    public void setDrawOptions(DrawOptions drawOptions) {
        this.drawOptions = drawOptions;
    }

    public BgImgOptions getBgImgOptions() {
        return bgImgOptions;
    }

    public void setBgImgOptions(BgImgOptions bgImgOptions) {
        this.bgImgOptions = bgImgOptions;
    }

    public LogoOptions getLogoOptions() {
        return logoOptions;
    }

    public void setLogoOptions(LogoOptions logoOptions) {
        this.logoOptions = logoOptions;
    }

    public DetectOptions getDetectOptions() {
        return detectOptions;
    }

    public void setDetectOptions(DetectOptions detectOptions) {
        this.detectOptions = detectOptions;
    }

    public Map<EncodeHintType, Object> getHints() {
        return hints;
    }

    public void setHints(Map<EncodeHintType, Object> hints) {
        this.hints = hints;
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }

    /**
     * logo 的配置信息
     */
    @Builder
    @Data
    public static class LogoOptions {

        /**
         * logo 图片
         */
        private BufferedImage logo;

        /**
         * logo 样式
         */
        private LogoStyle logoStyle;

        /**
         * logo 占二维码的比例
         */
        private int rate;

        /**
         * true 表示有边框，
         * false 表示无边框
         */
        private boolean border;

        /**
         * 边框颜色
         */
        private Color borderColor;

        public BufferedImage getLogo() {
            return logo;
        }

        public void setLogo(BufferedImage logo) {
            this.logo = logo;
        }

        public LogoStyle getLogoStyle() {
            return logoStyle;
        }

        public void setLogoStyle(LogoStyle logoStyle) {
            this.logoStyle = logoStyle;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

        public boolean isBorder() {
            return border;
        }

        public void setBorder(boolean border) {
            this.border = border;
        }

        public Color getBorderColor() {
            return borderColor;
        }

        public void setBorderColor(Color borderColor) {
            this.borderColor = borderColor;
        }
    }


    /**
     * 背景图的配置信息
     */
    @Builder
    @Data
    public static class BgImgOptions {
        /**
         * 背景图
         */
        private BufferedImage bgImg;

        /**
         * 背景图宽
         */
        private int bgW;

        /**
         * 背景图高
         */
        private int bgH;

        /**
         * 背景图样式
         */
        private BgImgStyle bgImgStyle;

        /**
         * if {@link #bgImgStyle} ==  QrCodeOptions.BgImgStyle.OVERRIDE，
         * 用于设置二维码的透明度
         */
        private float opacity;


        /**
         * if {@link #bgImgStyle} ==  QrCodeOptions.BgImgStyle.FILL
         * <p>
         * 用于设置二维码的绘制在背景图上的x坐标
         */
        private int startX;


        /**
         * if {@link #bgImgStyle} ==  QrCodeOptions.BgImgStyle.FILL
         * <p>
         * 用于设置二维码的绘制在背景图上的y坐标
         */
        private int startY;

        public int getBgW() {
            if (bgW == 0 && bgImg != null && bgImgStyle == BgImgStyle.FILL) {
                return bgImg.getWidth();
            }
            return bgW;
        }

        public int getBgH() {
            if (bgH == 0 && bgImg != null && bgImgStyle == BgImgStyle.FILL) {
                return bgImg.getHeight();
            }
            return bgH;
        }

        public BufferedImage getBgImg() {
            return bgImg;
        }

        public void setBgImg(BufferedImage bgImg) {
            this.bgImg = bgImg;
        }

        public void setBgW(int bgW) {
            this.bgW = bgW;
        }

        public void setBgH(int bgH) {
            this.bgH = bgH;
        }

        public BgImgStyle getBgImgStyle() {
            return bgImgStyle;
        }

        public void setBgImgStyle(BgImgStyle bgImgStyle) {
            this.bgImgStyle = bgImgStyle;
        }

        public float getOpacity() {
            return opacity;
        }

        public void setOpacity(float opacity) {
            this.opacity = opacity;
        }

        public int getStartX() {
            return startX;
        }

        public void setStartX(int startX) {
            this.startX = startX;
        }

        public int getStartY() {
            return startY;
        }

        public void setStartY(int startY) {
            this.startY = startY;
        }




        public static BgImgOptionsBuilder builder(){
            return new BgImgOptionsBuilder();
        }

        public static BgImgOptionsBuilder bgImgStyle(String em){
            return new BgImgOptionsBuilder();
        }

        /**
         * 背景配置信息初始化
         */
        @Builder
        @Data
        public static class BgImgOptionsBuilder{



        }

    }




    /**
     * 探测图形的配置信息
     */
    @Builder
    @Data
    public static class DetectOptions {
        private Color outColor;

        private Color inColor;

        /**
         * 探测图形，优先级高于颜色的定制（即存在图片时，用图片绘制探测图形）
         */
        private BufferedImage detectImg;

        public Color getOutColor() {
            return outColor;
        }

        public void setOutColor(Color outColor) {
            this.outColor = outColor;
        }

        public Color getInColor() {
            return inColor;
        }

        public void setInColor(Color inColor) {
            this.inColor = inColor;
        }

        public BufferedImage getDetectImg() {
            return detectImg;
        }

        public void setDetectImg(BufferedImage detectImg) {
            this.detectImg = detectImg;
        }
    }


    /**
     * 绘制二维码的配置信息
     */
    @Builder
    @Data
    public static class DrawOptions {
        /**
         * 着色颜色
         */
        private Color preColor;

        /**
         * 背景颜色
         */
        private Color bgColor;

        /**
         * 绘制样式
         */
        private DrawStyle drawStyle;


        /**
         * true 时表示支持对相邻的着色点进行合并处理 （即用一个大图来绘制相邻的两个着色点）
         * <p>
         * 说明： 三角形样式关闭该选项，因为留白过多，对识别有影响
         */
        private boolean enableScale;


        /**
         * 基础图片
         */
        private BufferedImage img;

        /**
         * 同一行相邻的两个着色点对应绘制的图片
         */
        private BufferedImage row2Img;

        /**
         * 同一列相邻的两个着色点对应绘制的图片
         */
        private BufferedImage col2img;

        /**
         * 以(x,y)为左定点的四个着色点对应绘制的图片
         */
        private BufferedImage size4Img;


        public boolean enableScale(ExpandType expandType) {
            if (!enableScale || !drawStyle.expand(expandType)) {
                return false;
            }

            if (drawStyle != DrawStyle.IMAGE) {
                return true;
            }


            if (expandType == ExpandType.SIZE4) {
                return size4Img != null;
            } else if (expandType == ExpandType.COL2) {
                return col2img != null;
            } else {
                return row2Img != null;
            }
        }

        public Color getPreColor() {
            return preColor;
        }

        public void setPreColor(Color preColor) {
            this.preColor = preColor;
        }

        public Color getBgColor() {
            return bgColor;
        }

        public void setBgColor(Color bgColor) {
            this.bgColor = bgColor;
        }

        public DrawStyle getDrawStyle() {
            return drawStyle;
        }

        public void setDrawStyle(DrawStyle drawStyle) {
            this.drawStyle = drawStyle;
        }

        public boolean isEnableScale() {
            return enableScale;
        }

        public void setEnableScale(boolean enableScale) {
            this.enableScale = enableScale;
        }

        public BufferedImage getImg() {
            return img;
        }

        public void setImg(BufferedImage img) {
            this.img = img;
        }

        public BufferedImage getRow2Img() {
            return row2Img;
        }

        public void setRow2Img(BufferedImage row2Img) {
            this.row2Img = row2Img;
        }

        public BufferedImage getCol2img() {
            return col2img;
        }

        public void setCol2img(BufferedImage col2img) {
            this.col2img = col2img;
        }

        public BufferedImage getSize4Img() {
            return size4Img;
        }

        public void setSize4Img(BufferedImage size4Img) {
            this.size4Img = size4Img;
        }
    }


    /**
     * logo的样式
     */
    public enum LogoStyle {
        ROUND,
        NORMAL;


        public static LogoStyle getStyle(String name) {
            return "ROUND".equalsIgnoreCase(name) ? ROUND : NORMAL;
        }
    }


    /**
     * 背景图样式
     */
    public enum BgImgStyle {
        /**
         * 设置二维码透明度，然后全覆盖背景图
         */
        OVERRIDE,

        /**
         * 将二维码填充在背景图的指定位置
         */
        FILL,


        /**
         * 背景图穿透显示, 即二维码主题色为透明，由背景图的颜色进行填充
         */
        PENETRATE,
        ;


        public static BgImgStyle getStyle(String name) {
            return "fill".equalsIgnoreCase(name) ? FILL : OVERRIDE;
        }
    }


    /**
     * 绘制二维码信息的样式
     */
    public enum DrawStyle {
        RECT { // 矩形

            @Override
            public void draw(Graphics2D g2d, int x, int y, int w, int h, BufferedImage img) {
                g2d.fillRect(x, y, w, h);
            }

            @Override
            public boolean expand(ExpandType expandType) {
                return true;
            }
        },
        CIRCLE {
            // 圆点
            @Override
            public void draw(Graphics2D g2d, int x, int y, int w, int h, BufferedImage img) {
                g2d.fill(new Ellipse2D.Float(x, y, w, h));
            }

            @Override
            public boolean expand(ExpandType expandType) {
                return expandType == ExpandType.SIZE4;
            }
        },
        TRIANGLE {
            // 三角形
            @Override
            public void draw(Graphics2D g2d, int x, int y, int w, int h, BufferedImage img) {
                int px[] = {x, x + (w >> 1), x + w};
                int py[] = {y + w, y, y + w};
                g2d.fillPolygon(px, py, 3);
            }

            @Override
            public boolean expand(ExpandType expandType) {
                return false;
            }
        },
        DIAMOND {
            // 五边形-钻石
            @Override
            public void draw(Graphics2D g2d, int x, int y, int size, int h, BufferedImage img) {
                int cell4 = size >> 2;
                int cell2 = size >> 1;
                int px[] = {x + cell4, x + size - cell4, x + size, x + cell2, x};
                int py[] = {y, y, y + cell2, y + size, y + cell2};
                g2d.fillPolygon(px, py, 5);
            }

            @Override
            public boolean expand(ExpandType expandType) {
                return expandType == ExpandType.SIZE4;
            }
        },
        SEXANGLE {
            // 六边形
            @Override
            public void draw(Graphics2D g2d, int x, int y, int size, int h, BufferedImage img) {
                int add = size >> 2;
                int px[] = {x + add, x + size - add, x + size, x + size - add, x + add, x};
                int py[] = {y, y, y + add + add, y + size, y + size, y + add + add};
                g2d.fillPolygon(px, py, 6);
            }

            @Override
            public boolean expand(ExpandType expandType) {
                return expandType == ExpandType.SIZE4;
            }
        },
        OCTAGON {
            // 八边形
            @Override
            public void draw(Graphics2D g2d, int x, int y, int size, int h, BufferedImage img) {
                int add = size / 3;
                int px[] = {x + add, x + size - add, x + size, x + size, x + size - add, x + add, x, x};
                int py[] = {y, y, y + add, y + size - add, y + size, y + size, y + size - add, y + add};
                g2d.fillPolygon(px, py, 8);
            }

            @Override
            public boolean expand(ExpandType expandType) {
                return expandType == ExpandType.SIZE4;
            }
        },
        IMAGE {
            // 自定义图片
            @Override
            public void draw(Graphics2D g2d, int x, int y, int w, int h, BufferedImage img) {
                g2d.drawImage(img, x, y, w, h, null);
            }

            @Override
            public boolean expand(ExpandType expandType) {
                return true;
            }
        },;

        private static Map<String, DrawStyle> map;

        static {
            map = new HashMap<>(10);
            for (DrawStyle style : DrawStyle.values()) {
                map.put(style.name(), style);
            }
        }

        public static DrawStyle getDrawStyle(String name) {
            if (StringUtils.isBlank(name)) { // 默认返回矩形
                return RECT;
            }


            DrawStyle style = map.get(name.toUpperCase());
            return style == null ? RECT : style;
        }


        public abstract void draw(Graphics2D g2d, int x, int y, int w, int h, BufferedImage img);


        /**
         * 返回是否支持绘制图形的扩展
         *
         * @param expandType
         * @return
         */
        public abstract boolean expand(ExpandType expandType);
    }


    public enum ExpandType {
        ROW2,
        COL2,
        SIZE4;
    }
}
