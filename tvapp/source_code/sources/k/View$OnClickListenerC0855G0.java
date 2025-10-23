package k;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.boxhdo.android.tv.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
/* renamed from: k.G0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnClickListenerC0855G0 extends Q.c implements View.OnClickListener {

    /* renamed from: N  reason: collision with root package name */
    public static final /* synthetic */ int f11880N = 0;

    /* renamed from: A  reason: collision with root package name */
    public final SearchView f11881A;

    /* renamed from: B  reason: collision with root package name */
    public final SearchableInfo f11882B;

    /* renamed from: C  reason: collision with root package name */
    public final Context f11883C;

    /* renamed from: D  reason: collision with root package name */
    public final WeakHashMap f11884D;

    /* renamed from: E  reason: collision with root package name */
    public final int f11885E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public ColorStateList f11886G;

    /* renamed from: H  reason: collision with root package name */
    public int f11887H;

    /* renamed from: I  reason: collision with root package name */
    public int f11888I;

    /* renamed from: J  reason: collision with root package name */
    public int f11889J;

    /* renamed from: K  reason: collision with root package name */
    public int f11890K;

    /* renamed from: L  reason: collision with root package name */
    public int f11891L;

    /* renamed from: M  reason: collision with root package name */
    public int f11892M;

    /* renamed from: x  reason: collision with root package name */
    public final int f11893x;

    /* renamed from: y  reason: collision with root package name */
    public final int f11894y;

    /* renamed from: z  reason: collision with root package name */
    public final LayoutInflater f11895z;

    public View$OnClickListenerC0855G0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f2822r = true;
        this.f2823s = null;
        this.f2821q = false;
        this.f2824t = -1;
        this.f2825u = new Q.a(this);
        this.f2826v = new Q.b(0, this);
        this.f11894y = suggestionRowLayout;
        this.f11893x = suggestionRowLayout;
        this.f11895z = (LayoutInflater) context.getSystemService("layout_inflater");
        this.F = 1;
        this.f11887H = -1;
        this.f11888I = -1;
        this.f11889J = -1;
        this.f11890K = -1;
        this.f11891L = -1;
        this.f11892M = -1;
        this.f11881A = searchView;
        this.f11882B = searchableInfo;
        this.f11885E = searchView.getSuggestionCommitIconResId();
        this.f11883C = context;
        this.f11884D = weakHashMap;
    }

    public static String h(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    @Override // Q.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.View$OnClickListenerC0855G0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // Q.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f11887H = cursor.getColumnIndex("suggest_text_1");
                this.f11888I = cursor.getColumnIndex("suggest_text_2");
                this.f11889J = cursor.getColumnIndex("suggest_text_2_url");
                this.f11890K = cursor.getColumnIndex("suggest_icon_1");
                this.f11891L = cursor.getColumnIndex("suggest_icon_2");
                this.f11892M = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // Q.c
    public final String c(Cursor cursor) {
        String h7;
        String h8;
        if (cursor == null) {
            return null;
        }
        String h9 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h9 != null) {
            return h9;
        }
        SearchableInfo searchableInfo = this.f11882B;
        if (searchableInfo.shouldRewriteQueryFromData() && (h8 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h8;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h7 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h7;
    }

    @Override // Q.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f11895z.inflate(this.f11893x, viewGroup, false);
        inflate.setTag(new C0853F0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f11885E);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f11883C.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.View$OnClickListenerC0855G0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f11883C.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // Q.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View inflate = this.f11895z.inflate(this.f11894y, viewGroup, false);
            if (inflate != null) {
                ((C0853F0) inflate.getTag()).f11875a.setText(e3.toString());
            }
            return inflate;
        }
    }

    @Override // Q.c, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View d = d(viewGroup);
            ((C0853F0) d.getTag()).f11875a.setText(e3.toString());
            return d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f2823s;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f2823s;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f11881A.o((CharSequence) tag);
        }
    }
}
