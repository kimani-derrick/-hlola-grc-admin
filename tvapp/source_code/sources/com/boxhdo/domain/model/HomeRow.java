package com.boxhdo.domain.model;

import M5.g;
import com.boxhdo.domain.type.MediaType;
import com.boxhdo.domain.type.NetworkType;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public interface HomeRow {

    /* loaded from: classes.dex */
    public static final class ContinueWatchRow implements HomeRow {

        /* renamed from: a  reason: collision with root package name */
        public final Shortcut f7995a;

        /* renamed from: b  reason: collision with root package name */
        public final List f7996b;

        public ContinueWatchRow(Shortcut shortcut, ArrayList arrayList) {
            this.f7995a = shortcut;
            this.f7996b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ContinueWatchRow) {
                ContinueWatchRow continueWatchRow = (ContinueWatchRow) obj;
                return g.a(this.f7995a, continueWatchRow.f7995a) && g.a(this.f7996b, continueWatchRow.f7996b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f7996b.hashCode() + (this.f7995a.hashCode() * 31);
        }

        public final String toString() {
            return "ContinueWatchRow(shortcut=" + this.f7995a + ", list=" + this.f7996b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class MovieRow implements HomeRow {

        /* renamed from: a  reason: collision with root package name */
        public final Shortcut f7997a;

        /* renamed from: b  reason: collision with root package name */
        public final List f7998b;

        /* renamed from: c  reason: collision with root package name */
        public final MediaType f7999c;

        public MovieRow(Shortcut shortcut, List list, MediaType mediaType) {
            g.f(list, "list");
            this.f7997a = shortcut;
            this.f7998b = list;
            this.f7999c = mediaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MovieRow) {
                MovieRow movieRow = (MovieRow) obj;
                return g.a(this.f7997a, movieRow.f7997a) && g.a(this.f7998b, movieRow.f7998b) && this.f7999c == movieRow.f7999c;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.f7998b.hashCode() + (this.f7997a.hashCode() * 31)) * 31;
            MediaType mediaType = this.f7999c;
            return hashCode + (mediaType == null ? 0 : mediaType.hashCode());
        }

        public final String toString() {
            return "MovieRow(shortcut=" + this.f7997a + ", list=" + this.f7998b + ", mediaType=" + this.f7999c + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class NetworkRow implements HomeRow {

        /* renamed from: a  reason: collision with root package name */
        public final NetworkType f8000a;

        /* renamed from: b  reason: collision with root package name */
        public final Shortcut f8001b;

        /* renamed from: c  reason: collision with root package name */
        public final List f8002c;

        public NetworkRow(NetworkType networkType, Shortcut shortcut, List list) {
            this.f8000a = networkType;
            this.f8001b = shortcut;
            this.f8002c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NetworkRow) {
                NetworkRow networkRow = (NetworkRow) obj;
                return this.f8000a == networkRow.f8000a && g.a(this.f8001b, networkRow.f8001b) && g.a(this.f8002c, networkRow.f8002c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f8001b.hashCode();
            return this.f8002c.hashCode() + ((hashCode + (this.f8000a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "NetworkRow(networkType=" + this.f8000a + ", shortcut=" + this.f8001b + ", list=" + this.f8002c + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class ShortCutRow implements HomeRow {

        /* renamed from: a  reason: collision with root package name */
        public final List f8003a;

        public ShortCutRow(List list) {
            this.f8003a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShortCutRow) && g.a(this.f8003a, ((ShortCutRow) obj).f8003a);
        }

        public final int hashCode() {
            return this.f8003a.hashCode();
        }

        public final String toString() {
            return "ShortCutRow(list=" + this.f8003a + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class SliderRow implements HomeRow {

        /* renamed from: a  reason: collision with root package name */
        public final Movie f8004a;

        public SliderRow(Movie movie) {
            this.f8004a = movie;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SliderRow) && g.a(this.f8004a, ((SliderRow) obj).f8004a);
        }

        public final int hashCode() {
            return this.f8004a.hashCode();
        }

        public final String toString() {
            return "SliderRow(movie=" + this.f8004a + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class TabsRow implements HomeRow {

        /* renamed from: a  reason: collision with root package name */
        public final Shortcut f8005a;

        /* renamed from: b  reason: collision with root package name */
        public final List f8006b;

        public TabsRow(Shortcut shortcut, List list) {
            this.f8005a = shortcut;
            this.f8006b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TabsRow) {
                TabsRow tabsRow = (TabsRow) obj;
                return g.a(this.f8005a, tabsRow.f8005a) && g.a(this.f8006b, tabsRow.f8006b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f8006b.hashCode() + (this.f8005a.hashCode() * 31);
        }

        public final String toString() {
            return "TabsRow(shortcut=" + this.f8005a + ", list=" + this.f8006b + ")";
        }
    }
}
