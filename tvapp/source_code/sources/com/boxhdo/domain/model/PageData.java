package com.boxhdo.domain.model;

import M5.g;
import java.util.List;
/* loaded from: classes.dex */
public final class PageData<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f8052a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8053b;

    /* renamed from: c  reason: collision with root package name */
    public final List f8054c;

    public PageData(int i7, int i8, List list) {
        this.f8052a = i7;
        this.f8053b = i8;
        this.f8054c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PageData) {
            PageData pageData = (PageData) obj;
            return this.f8052a == pageData.f8052a && this.f8053b == pageData.f8053b && g.a(this.f8054c, pageData.f8054c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8054c.hashCode() + (((this.f8052a * 31) + this.f8053b) * 31);
    }

    public final String toString() {
        return "PageData(page=" + this.f8052a + ", totalPage=" + this.f8053b + ", data=" + this.f8054c + ")";
    }
}
