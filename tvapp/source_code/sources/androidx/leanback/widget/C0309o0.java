package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.boxhdo.android.tv.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
/* renamed from: androidx.leanback.widget.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309o0 implements RecognitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchBar f6623a;

    public C0309o0(SearchBar searchBar) {
        this.f6623a = searchBar;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i7) {
        String str;
        switch (i7) {
            case 1:
                int i8 = SearchBar.f6490N;
                str = "recognizer network timeout";
                Log.w("SearchBar", str);
                break;
            case 2:
                int i9 = SearchBar.f6490N;
                str = "recognizer network error";
                Log.w("SearchBar", str);
                break;
            case 3:
                int i10 = SearchBar.f6490N;
                str = "recognizer audio error";
                Log.w("SearchBar", str);
                break;
            case 4:
                int i11 = SearchBar.f6490N;
                str = "recognizer server error";
                Log.w("SearchBar", str);
                break;
            case 5:
                int i12 = SearchBar.f6490N;
                str = "recognizer client error";
                Log.w("SearchBar", str);
                break;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                int i13 = SearchBar.f6490N;
                str = "recognizer speech timeout";
                Log.w("SearchBar", str);
                break;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                int i14 = SearchBar.f6490N;
                str = "recognizer no match";
                Log.w("SearchBar", str);
                break;
            case 8:
                int i15 = SearchBar.f6490N;
                str = "recognizer busy";
                Log.w("SearchBar", str);
                break;
            case 9:
                int i16 = SearchBar.f6490N;
                str = "recognizer insufficient permissions";
                Log.w("SearchBar", str);
                break;
            default:
                int i17 = SearchBar.f6490N;
                Log.d("SearchBar", "recognizer other error");
                break;
        }
        SearchBar searchBar = this.f6623a;
        searchBar.b();
        searchBar.f6510x.post(new H.a((int) R.raw.lb_voice_failure, 2, searchBar));
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i7, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        String str;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList != null && stringArrayList.size() != 0) {
            String str2 = stringArrayList.get(0);
            if (stringArrayList.size() > 1) {
                str = stringArrayList.get(1);
            } else {
                str = null;
            }
            SearchEditText searchEditText = this.f6623a.f6503q;
            searchEditText.getClass();
            if (str2 == null) {
                str2 = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            if (str != null) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str);
                Matcher matcher = K0.f6408v.matcher(str);
                while (matcher.find()) {
                    int start = matcher.start() + length;
                    spannableStringBuilder.setSpan(new J0(searchEditText, str.charAt(matcher.start()), start), start, matcher.end() + length, 33);
                }
            }
            searchEditText.f6413t = Math.max(str2.length(), searchEditText.f6413t);
            searchEditText.setText(new SpannedString(spannableStringBuilder));
            searchEditText.bringPointIntoView(searchEditText.length());
            ObjectAnimator objectAnimator = searchEditText.f6414u;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            int streamPosition = searchEditText.getStreamPosition();
            int length2 = searchEditText.length();
            int i7 = length2 - streamPosition;
            if (i7 > 0) {
                if (searchEditText.f6414u == null) {
                    ObjectAnimator objectAnimator2 = new ObjectAnimator();
                    searchEditText.f6414u = objectAnimator2;
                    objectAnimator2.setTarget(searchEditText);
                    searchEditText.f6414u.setProperty(K0.f6409w);
                }
                searchEditText.f6414u.setIntValues(streamPosition, length2);
                searchEditText.f6414u.setDuration(i7 * 50);
                searchEditText.f6414u.start();
            }
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        SearchBar searchBar = this.f6623a;
        SpeechOrbView speechOrbView = searchBar.f6504r;
        speechOrbView.setOrbColors(speechOrbView.f6546J);
        speechOrbView.setOrbIcon(speechOrbView.getResources().getDrawable(R.drawable.lb_ic_search_mic));
        speechOrbView.a(true);
        speechOrbView.f6516C = false;
        speechOrbView.b();
        View view = speechOrbView.f6523s;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        speechOrbView.f6548L = 0;
        speechOrbView.f6549M = true;
        searchBar.f6510x.post(new H.a((int) R.raw.lb_voice_open, 2, searchBar));
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        SearchBar searchBar = this.f6623a;
        if (stringArrayList != null) {
            String str = stringArrayList.get(0);
            searchBar.f6506t = str;
            searchBar.f6503q.setText(str);
            TextUtils.isEmpty(searchBar.f6506t);
        }
        searchBar.b();
        searchBar.f6510x.post(new H.a((int) R.raw.lb_voice_success, 2, searchBar));
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        this.f6623a.f6504r.setSoundLevel(f < 0.0f ? 0 : (int) (f * 10.0f));
    }
}
