package com.boxhdo.domain.model;

import A5.k;
import M5.g;
import U5.n;
import android.os.Parcel;
import android.os.Parcelable;
import com.boxhdo.domain.type.MediaType;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class Movie implements Parcelable {
    public static final Parcelable.Creator<Movie> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final String f8014A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f8015B;

    /* renamed from: C  reason: collision with root package name */
    public final int f8016C;

    /* renamed from: D  reason: collision with root package name */
    public final int f8017D;

    /* renamed from: E  reason: collision with root package name */
    public final String f8018E;
    public final double F;

    /* renamed from: G  reason: collision with root package name */
    public final long f8019G;

    /* renamed from: H  reason: collision with root package name */
    public final List f8020H;

    /* renamed from: I  reason: collision with root package name */
    public final List f8021I;

    /* renamed from: J  reason: collision with root package name */
    public final List f8022J;

    /* renamed from: K  reason: collision with root package name */
    public final List f8023K;

    /* renamed from: L  reason: collision with root package name */
    public final List f8024L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f8025M;

    /* renamed from: N  reason: collision with root package name */
    public final Vote f8026N;

    /* renamed from: O  reason: collision with root package name */
    public String f8027O;

    /* renamed from: P  reason: collision with root package name */
    public String f8028P;

    /* renamed from: q  reason: collision with root package name */
    public final long f8029q;

    /* renamed from: r  reason: collision with root package name */
    public final String f8030r;

    /* renamed from: s  reason: collision with root package name */
    public final String f8031s;

    /* renamed from: t  reason: collision with root package name */
    public final String f8032t;

    /* renamed from: u  reason: collision with root package name */
    public final long f8033u;

    /* renamed from: v  reason: collision with root package name */
    public final String f8034v;

    /* renamed from: w  reason: collision with root package name */
    public final String f8035w;

    /* renamed from: x  reason: collision with root package name */
    public final int f8036x;

    /* renamed from: y  reason: collision with root package name */
    public final MediaType f8037y;

    /* renamed from: z  reason: collision with root package name */
    public final String f8038z;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Movie> {
        @Override // android.os.Parcelable.Creator
        public final Movie createFromParcel(Parcel parcel) {
            boolean z7;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            boolean z8;
            Vote createFromParcel;
            g.f(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            long readLong2 = parcel.readLong();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            MediaType createFromParcel2 = MediaType.CREATOR.createFromParcel(parcel);
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString8 = parcel.readString();
            double readDouble = parcel.readDouble();
            long readLong3 = parcel.readLong();
            int readInt4 = parcel.readInt();
            boolean z9 = z7;
            ArrayList arrayList7 = new ArrayList(readInt4);
            int i7 = 0;
            while (i7 != readInt4) {
                arrayList7.add(Genre.CREATOR.createFromParcel(parcel));
                i7++;
                readInt4 = readInt4;
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(readInt5);
            int i8 = 0;
            while (i8 != readInt5) {
                arrayList8.add(Country.CREATOR.createFromParcel(parcel));
                i8++;
                readInt5 = readInt5;
            }
            if (parcel.readInt() == 0) {
                arrayList = arrayList8;
                arrayList2 = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt6);
                arrayList = arrayList8;
                int i9 = 0;
                while (i9 != readInt6) {
                    arrayList9.add(Cast.CREATOR.createFromParcel(parcel));
                    i9++;
                    readInt6 = readInt6;
                }
                arrayList2 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int readInt7 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt7);
                arrayList3 = arrayList2;
                int i10 = 0;
                while (i10 != readInt7) {
                    arrayList10.add(Company.CREATOR.createFromParcel(parcel));
                    i10++;
                    readInt7 = readInt7;
                }
                arrayList4 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = arrayList4;
                arrayList6 = null;
            } else {
                int readInt8 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt8);
                arrayList5 = arrayList4;
                int i11 = 0;
                while (i11 != readInt8) {
                    arrayList11.add(Season.CREATOR.createFromParcel(parcel));
                    i11++;
                    readInt8 = readInt8;
                }
                arrayList6 = arrayList11;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = Vote.CREATOR.createFromParcel(parcel);
            }
            return new Movie(readLong, readString, readString2, readString3, readLong2, readString4, readString5, readInt, createFromParcel2, readString6, readString7, z9, readInt2, readInt3, readString8, readDouble, readLong3, arrayList7, arrayList, arrayList3, arrayList5, arrayList6, z8, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Movie[] newArray(int i7) {
            return new Movie[i7];
        }
    }

    public Movie() {
        this(0L, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, 0, (MediaType) null, (String) null, (String) null, false, 0, 0, (String) null, 0.0d, 0L, (List) null, (List) null, (List) null, (List) null, false, (Vote) null, 16777215);
    }

    public final String a() {
        List list = this.f8021I;
        return list.isEmpty() ^ true ? k.a0(list, null, null, null, Movie$countryString$1.f8039r, 31) : this.f8027O;
    }

    public final String d() {
        List list = this.f8020H;
        return list.isEmpty() ^ true ? k.a0(list, null, null, null, Movie$genresString$1.f8040r, 31) : this.f8028P;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        Calendar calendar;
        String str = this.f8035w;
        g.f(str, "<this>");
        if (!n.X(str)) {
            try {
                Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str);
                if (parse == null) {
                    return "N/A";
                }
                calendar = Calendar.getInstance();
                calendar.setTime(parse);
            } catch (Exception unused) {
                return "N/A";
            }
        }
        return String.valueOf(calendar.get(1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Movie) {
            Movie movie = (Movie) obj;
            return this.f8029q == movie.f8029q && g.a(this.f8030r, movie.f8030r) && g.a(this.f8031s, movie.f8031s) && g.a(this.f8032t, movie.f8032t) && this.f8033u == movie.f8033u && g.a(this.f8034v, movie.f8034v) && g.a(this.f8035w, movie.f8035w) && this.f8036x == movie.f8036x && this.f8037y == movie.f8037y && g.a(this.f8038z, movie.f8038z) && g.a(this.f8014A, movie.f8014A) && this.f8015B == movie.f8015B && this.f8016C == movie.f8016C && this.f8017D == movie.f8017D && g.a(this.f8018E, movie.f8018E) && Double.compare(this.F, movie.F) == 0 && this.f8019G == movie.f8019G && g.a(this.f8020H, movie.f8020H) && g.a(this.f8021I, movie.f8021I) && g.a(this.f8022J, movie.f8022J) && g.a(this.f8023K, movie.f8023K) && g.a(this.f8024L, movie.f8024L) && this.f8025M == movie.f8025M && g.a(this.f8026N, movie.f8026N);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j7 = this.f8029q;
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f8030r), 31, this.f8031s), 31, this.f8032t);
        long j8 = this.f8033u;
        int i8 = AbstractC0515y1.i(AbstractC0515y1.i((this.f8037y.hashCode() + ((AbstractC0515y1.i(AbstractC0515y1.i((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31, 31, this.f8034v), 31, this.f8035w) + this.f8036x) * 31)) * 31, 31, this.f8038z), 31, this.f8014A);
        int i9 = 1;
        boolean z7 = this.f8015B;
        int i10 = z7;
        if (z7 != 0) {
            i10 = 1;
        }
        int i11 = AbstractC0515y1.i((((((i8 + i10) * 31) + this.f8016C) * 31) + this.f8017D) * 31, 31, this.f8018E);
        long doubleToLongBits = Double.doubleToLongBits(this.F);
        long j9 = this.f8019G;
        int hashCode4 = (this.f8021I.hashCode() + ((this.f8020H.hashCode() + ((((i11 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31)) * 31)) * 31;
        int i12 = 0;
        List list = this.f8022J;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i13 = (hashCode4 + hashCode) * 31;
        List list2 = this.f8023K;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i14 = (i13 + hashCode2) * 31;
        List list3 = this.f8024L;
        if (list3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list3.hashCode();
        }
        int i15 = (i14 + hashCode3) * 31;
        boolean z8 = this.f8025M;
        if (!z8) {
            i9 = z8 ? 1 : 0;
        }
        int i16 = (i15 + i9) * 31;
        Vote vote = this.f8026N;
        if (vote != null) {
            i12 = vote.hashCode();
        }
        return i16 + i12;
    }

    public final String toString() {
        boolean z7 = this.f8025M;
        return "Movie(id=" + this.f8029q + ", backdropPath=" + this.f8030r + ", posterPath=" + this.f8031s + ", title=" + this.f8032t + ", tmdbId=" + this.f8033u + ", overview=" + this.f8034v + ", releaseDate=" + this.f8035w + ", runtime=" + this.f8036x + ", type=" + this.f8037y + ", slug=" + this.f8038z + ", trailer=" + this.f8014A + ", infoCompleted=" + this.f8015B + ", latestSeason=" + this.f8016C + ", latestEpisode=" + this.f8017D + ", quality=" + this.f8018E + ", imdbRating=" + this.F + ", updateAt=" + this.f8019G + ", genres=" + this.f8020H + ", countries=" + this.f8021I + ", cast=" + this.f8022J + ", companies=" + this.f8023K + ", seasons=" + this.f8024L + ", inWatchList=" + z7 + ", vote=" + this.f8026N + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f8029q);
        parcel.writeString(this.f8030r);
        parcel.writeString(this.f8031s);
        parcel.writeString(this.f8032t);
        parcel.writeLong(this.f8033u);
        parcel.writeString(this.f8034v);
        parcel.writeString(this.f8035w);
        parcel.writeInt(this.f8036x);
        this.f8037y.writeToParcel(parcel, i7);
        parcel.writeString(this.f8038z);
        parcel.writeString(this.f8014A);
        parcel.writeInt(this.f8015B ? 1 : 0);
        parcel.writeInt(this.f8016C);
        parcel.writeInt(this.f8017D);
        parcel.writeString(this.f8018E);
        parcel.writeDouble(this.F);
        parcel.writeLong(this.f8019G);
        List<Genre> list = this.f8020H;
        parcel.writeInt(list.size());
        for (Genre genre : list) {
            genre.writeToParcel(parcel, i7);
        }
        List<Country> list2 = this.f8021I;
        parcel.writeInt(list2.size());
        for (Country country : list2) {
            country.writeToParcel(parcel, i7);
        }
        List<Cast> list3 = this.f8022J;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Cast cast : list3) {
                cast.writeToParcel(parcel, i7);
            }
        }
        List<Company> list4 = this.f8023K;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (Company company : list4) {
                company.writeToParcel(parcel, i7);
            }
        }
        List<Season> list5 = this.f8024L;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            for (Season season : list5) {
                season.writeToParcel(parcel, i7);
            }
        }
        parcel.writeInt(this.f8025M ? 1 : 0);
        Vote vote = this.f8026N;
        if (vote == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        vote.writeToParcel(parcel, i7);
    }

    public Movie(long j7, String str, String str2, String str3, long j8, String str4, String str5, int i7, MediaType mediaType, String str6, String str7, boolean z7, int i8, int i9, String str8, double d, long j9, List list, List list2, List list3, List list4, List list5, boolean z8, Vote vote) {
        g.f(str, "backdropPath");
        g.f(str2, "posterPath");
        g.f(str3, "title");
        g.f(str4, "overview");
        g.f(str5, "releaseDate");
        g.f(mediaType, "type");
        g.f(str6, "slug");
        g.f(str7, "trailer");
        g.f(str8, "quality");
        g.f(list, "genres");
        g.f(list2, "countries");
        this.f8029q = j7;
        this.f8030r = str;
        this.f8031s = str2;
        this.f8032t = str3;
        this.f8033u = j8;
        this.f8034v = str4;
        this.f8035w = str5;
        this.f8036x = i7;
        this.f8037y = mediaType;
        this.f8038z = str6;
        this.f8014A = str7;
        this.f8015B = z7;
        this.f8016C = i8;
        this.f8017D = i9;
        this.f8018E = str8;
        this.F = d;
        this.f8019G = j9;
        this.f8020H = list;
        this.f8021I = list2;
        this.f8022J = list3;
        this.f8023K = list4;
        this.f8024L = list5;
        this.f8025M = z8;
        this.f8026N = vote;
        this.f8027O = "";
        this.f8028P = "";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Movie(long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, long r39, java.lang.String r41, java.lang.String r42, int r43, com.boxhdo.domain.type.MediaType r44, java.lang.String r45, java.lang.String r46, boolean r47, int r48, int r49, java.lang.String r50, double r51, long r53, java.util.List r55, java.util.List r56, java.util.List r57, java.util.List r58, boolean r59, com.boxhdo.domain.model.Vote r60, int r61) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.boxhdo.domain.model.Movie.<init>(long, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, com.boxhdo.domain.type.MediaType, java.lang.String, java.lang.String, boolean, int, int, java.lang.String, double, long, java.util.List, java.util.List, java.util.List, java.util.List, boolean, com.boxhdo.domain.model.Vote, int):void");
    }
}
