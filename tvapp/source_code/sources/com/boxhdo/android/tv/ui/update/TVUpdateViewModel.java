package com.boxhdo.android.tv.ui.update;

import F1.r;
import M5.g;
import W5.p0;
import Z5.s;
import Z5.w;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.LatestVersion;
import k1.C0935h;
import q1.C1104f;
import q1.i;
/* loaded from: classes.dex */
public final class TVUpdateViewModel extends i {
    public final Application f;

    /* renamed from: g  reason: collision with root package name */
    public final C0935h f7923g;

    /* renamed from: h  reason: collision with root package name */
    public final w f7924h;

    /* renamed from: i  reason: collision with root package name */
    public final w f7925i;

    /* renamed from: j  reason: collision with root package name */
    public final w f7926j;

    /* renamed from: k  reason: collision with root package name */
    public p0 f7927k;

    /* renamed from: l  reason: collision with root package name */
    public Uri f7928l;

    /* renamed from: m  reason: collision with root package name */
    public String f7929m;

    public TVUpdateViewModel(Application application, C0935h c0935h) {
        g.f(c0935h, "downloader");
        this.f = application;
        this.f7923g = c0935h;
        this.f7924h = s.b(0);
        this.f7925i = s.b(new C1104f(r.f652b));
        this.f7926j = s.b(new LatestVersion(0));
        this.f7929m = "";
    }

    public final void g() {
        Uri uri;
        Application application = this.f;
        try {
            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            g.e(uri, "EXTERNAL_CONTENT_URI");
            ContentResolver contentResolver = application.getContentResolver();
            String string = application.getString(R.string.apk_name);
            Cursor query = contentResolver.query(uri, new String[]{"_id"}, "_display_name = ?", new String[]{string + ".apk"}, null);
            if (query == null || !query.moveToFirst()) {
                return;
            }
            Uri withAppendedId = ContentUris.withAppendedId(uri, query.getLong(query.getColumnIndexOrThrow("_id")));
            g.e(withAppendedId, "withAppendedId(downloadUri, id)");
            contentResolver.delete(withAppendedId, null, null);
            query.close();
        } catch (Exception unused) {
        }
    }
}
