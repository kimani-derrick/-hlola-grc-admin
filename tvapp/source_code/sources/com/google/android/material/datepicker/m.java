package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new android.support.v4.media.a(14);

    /* renamed from: q  reason: collision with root package name */
    public final Calendar f8890q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8891r;

    /* renamed from: s  reason: collision with root package name */
    public final int f8892s;

    /* renamed from: t  reason: collision with root package name */
    public final int f8893t;

    /* renamed from: u  reason: collision with root package name */
    public final int f8894u;

    /* renamed from: v  reason: collision with root package name */
    public final long f8895v;

    /* renamed from: w  reason: collision with root package name */
    public String f8896w;

    public m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a7 = u.a(calendar);
        this.f8890q = a7;
        this.f8891r = a7.get(2);
        this.f8892s = a7.get(1);
        this.f8893t = a7.getMaximum(7);
        this.f8894u = a7.getActualMaximum(5);
        this.f8895v = a7.getTimeInMillis();
    }

    public static m d(int i7, int i8) {
        Calendar c5 = u.c(null);
        c5.set(1, i7);
        c5.set(2, i8);
        return new m(c5);
    }

    public static m e(long j7) {
        Calendar c5 = u.c(null);
        c5.setTimeInMillis(j7);
        return new m(c5);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(m mVar) {
        return this.f8890q.compareTo(mVar.f8890q);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f8891r == mVar.f8891r && this.f8892s == mVar.f8892s;
        }
        return false;
    }

    public final int g() {
        Calendar calendar = this.f8890q;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f8893t : firstDayOfWeek;
    }

    public final String h(Context context) {
        if (this.f8896w == null) {
            long timeInMillis = this.f8890q.getTimeInMillis();
            this.f8896w = DateUtils.formatDateTime(context, timeInMillis - TimeZone.getDefault().getOffset(timeInMillis), 36);
        }
        return this.f8896w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8891r), Integer.valueOf(this.f8892s)});
    }

    public final int i(m mVar) {
        if (this.f8890q instanceof GregorianCalendar) {
            return (mVar.f8891r - this.f8891r) + ((mVar.f8892s - this.f8892s) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8892s);
        parcel.writeInt(this.f8891r);
    }
}
