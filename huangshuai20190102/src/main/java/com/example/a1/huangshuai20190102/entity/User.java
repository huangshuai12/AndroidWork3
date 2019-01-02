package com.example.a1.huangshuai20190102.entity;

import java.util.List;

public class User {
    private String msg;
    private String code;
    private DataBean data;
    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private List<BannerBean> banner;
        private List<FenleiBean> fenlei;
        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<FenleiBean> getFenlei() {
            return fenlei;
        }

        public void setFenlei(List<FenleiBean> fenlei) {
            this.fenlei = fenlei;
        }

        public static class MiaoshaBean {

            private String name;
            private List<ListBean> list;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                private String images;
                private int price;
                private String title;
                public String getImages() {
                    return images;
                }
                public void setImages(String images) {
                    this.images = images;
                }
                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }
                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }
        }

        public static class TuijianBean {
            private String name;
            private List<ListBeanX> list;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<ListBeanX> getList() {
                return list;
            }

            public void setList(List<ListBeanX> list) {
                this.list = list;
            }

            public static class ListBeanX {
                private String images;
                private int price;
                private String title;
                public String getImages() {
                    return images;
                }

                public void setImages(String images) {
                    this.images = images;
                }
                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }
                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }
        }

        public static class BannerBean {
            private String title;
            private String url;
            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class FenleiBean {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

}
