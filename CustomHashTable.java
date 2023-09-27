{"payload":{"allShortcutsEnabled":true,"fileTree":{"Programming Project 3/src/Prog3":{"items":[{"name":"CustomHashTable.java","path":"Programming Project 3/src/Prog3/CustomHashTable.java","contentType":"file"},{"name":"CustomLinklist.java","path":"Programming Project 3/src/Prog3/CustomLinklist.java","contentType":"file"},{"name":"WriterBot.java","path":"Programming Project 3/src/Prog3/WriterBot.java","contentType":"file"}],"totalCount":3},"Programming Project 3/src":{"items":[{"name":"Prog3","path":"Programming Project 3/src/Prog3","contentType":"directory"}],"totalCount":1},"Programming Project 3":{"items":[{"name":".idea","path":"Programming Project 3/.idea","contentType":"directory"},{"name":"src","path":"Programming Project 3/src","contentType":"directory"},{"name":".gitignore","path":"Programming Project 3/.gitignore","contentType":"file"},{"name":"ReadMe.md","path":"Programming Project 3/ReadMe.md","contentType":"file"}],"totalCount":4},"":{"items":[{"name":"Programming Project 1","path":"Programming Project 1","contentType":"directory"},{"name":"Programming Project 2","path":"Programming Project 2","contentType":"directory"},{"name":"Programming Project 3","path":"Programming Project 3","contentType":"directory"},{"name":".gitignore","path":".gitignore","contentType":"file"},{"name":"HW1.md","path":"HW1.md","contentType":"file"},{"name":"HW2.md","path":"HW2.md","contentType":"file"},{"name":"HW3.md","path":"HW3.md","contentType":"file"},{"name":"HW4.md","path":"HW4.md","contentType":"file"},{"name":"HW5.md","path":"HW5.md","contentType":"file"},{"name":"Prog1.md","path":"Prog1.md","contentType":"file"},{"name":"Prog2.md","path":"Prog2.md","contentType":"file"},{"name":"Prog3.md","path":"Prog3.md","contentType":"file"},{"name":"hello.java","path":"hello.java","contentType":"file"}],"totalCount":13}},"fileTreeProcessingTime":9.505602,"foldersToFetch":[],"reducedMotionEnabled":"system","repo":{"id":656772281,"defaultBranch":"main","name":"CSDS233-s23-2","ownerLogin":"cwru-courses","currentUserCanPush":true,"isFork":false,"isEmpty":false,"createdAt":"2023-06-21T11:51:42.000-04:00","ownerAvatar":"https://avatars.githubusercontent.com/u/58530518?v=4","public":false,"private":true,"isOrgOwned":true},"symbolsExpanded":false,"treeExpanded":true,"refInfo":{"name":"main","listCacheKey":"v0:1690384679.0","canEdit":true,"refType":"branch","currentOid":"4ac67b4dafdf7c76dfb03adc87afb85b208c6755"},"path":"Programming Project 3/src/Prog3/CustomHashTable.java","currentUser":{"id":137304377,"login":"Jia22k","userEmail":"jxk1403@case.edu"},"blob":{"rawLines":["","package Prog3;","","public class CustomHashTable {","","    private CustomLinklist<Character>[] array = new CustomLinklist[999983];","","    public CustomHashTable() {","        for (int count = 0; count < this.getArray().length; count++) {","            this.getArray()[count] = new CustomLinklist<>();","        }","    }","","    public static int[] hashFunction(char... chars) {","        final int base = 101;","        long key = 0;","        for (int count = 0; count < chars.length; count++) {","            key = (key * base) + chars[count];","        }","        return new int[]{(int) (Math.abs(key) % 999983), (int) key};","    }","","    public void insert(char nextChar, char... chars) {","        int[] inputs = hashFunction(chars);","        this.getArray()[inputs[0]].addElement(inputs[1], nextChar);","    }","","    public char getElement(char... chars) {","        int[] inputs = hashFunction(chars);","        return this.getArray()[inputs[0]].getChar(inputs[1]);","    }","","    public CustomLinklist<Character>[] getArray() {","        return array;","    }","","    public void setArray(CustomLinklist<Character>[] array) {","        this.array = array;","    }","","}"],"stylingDirectives":[[],[{"start":0,"end":7,"cssClass":"pl-k"},{"start":8,"end":13,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-k"},{"start":13,"end":28,"cssClass":"pl-smi"}],[],[{"start":4,"end":11,"cssClass":"pl-k"},{"start":12,"end":26,"cssClass":"pl-smi"},{"start":27,"end":36,"cssClass":"pl-smi"},{"start":40,"end":45,"cssClass":"pl-s1"},{"start":48,"end":51,"cssClass":"pl-k"},{"start":52,"end":66,"cssClass":"pl-smi"},{"start":67,"end":73,"cssClass":"pl-c1"}],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":26,"cssClass":"pl-smi"}],[{"start":8,"end":11,"cssClass":"pl-k"},{"start":13,"end":16,"cssClass":"pl-smi"},{"start":17,"end":22,"cssClass":"pl-s1"},{"start":25,"end":26,"cssClass":"pl-c1"},{"start":28,"end":33,"cssClass":"pl-s1"},{"start":36,"end":40,"cssClass":"pl-smi"},{"start":41,"end":49,"cssClass":"pl-en"},{"start":52,"end":58,"cssClass":"pl-s1"},{"start":60,"end":65,"cssClass":"pl-s1"}],[{"start":12,"end":16,"cssClass":"pl-smi"},{"start":17,"end":25,"cssClass":"pl-en"},{"start":28,"end":33,"cssClass":"pl-s1"},{"start":37,"end":40,"cssClass":"pl-k"},{"start":41,"end":55,"cssClass":"pl-smi"}],[],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":17,"cssClass":"pl-k"},{"start":18,"end":21,"cssClass":"pl-smi"},{"start":24,"end":36,"cssClass":"pl-en"},{"start":37,"end":41,"cssClass":"pl-smi"},{"start":45,"end":50,"cssClass":"pl-s1"}],[{"start":8,"end":13,"cssClass":"pl-k"},{"start":14,"end":17,"cssClass":"pl-smi"},{"start":18,"end":22,"cssClass":"pl-s1"},{"start":25,"end":28,"cssClass":"pl-c1"}],[{"start":8,"end":12,"cssClass":"pl-smi"},{"start":13,"end":16,"cssClass":"pl-s1"},{"start":19,"end":20,"cssClass":"pl-c1"}],[{"start":8,"end":11,"cssClass":"pl-k"},{"start":13,"end":16,"cssClass":"pl-smi"},{"start":17,"end":22,"cssClass":"pl-s1"},{"start":25,"end":26,"cssClass":"pl-c1"},{"start":28,"end":33,"cssClass":"pl-s1"},{"start":36,"end":41,"cssClass":"pl-s1"},{"start":42,"end":48,"cssClass":"pl-s1"},{"start":50,"end":55,"cssClass":"pl-s1"}],[{"start":12,"end":15,"cssClass":"pl-s1"},{"start":19,"end":22,"cssClass":"pl-s1"},{"start":25,"end":29,"cssClass":"pl-s1"},{"start":33,"end":38,"cssClass":"pl-s1"},{"start":39,"end":44,"cssClass":"pl-s1"}],[],[{"start":8,"end":14,"cssClass":"pl-k"},{"start":15,"end":18,"cssClass":"pl-k"},{"start":19,"end":22,"cssClass":"pl-smi"},{"start":26,"end":29,"cssClass":"pl-smi"},{"start":32,"end":36,"cssClass":"pl-smi"},{"start":37,"end":40,"cssClass":"pl-en"},{"start":41,"end":44,"cssClass":"pl-s1"},{"start":48,"end":54,"cssClass":"pl-c1"},{"start":58,"end":61,"cssClass":"pl-smi"},{"start":63,"end":66,"cssClass":"pl-s1"}],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":22,"cssClass":"pl-en"},{"start":23,"end":27,"cssClass":"pl-smi"},{"start":28,"end":36,"cssClass":"pl-s1"},{"start":38,"end":42,"cssClass":"pl-smi"},{"start":46,"end":51,"cssClass":"pl-s1"}],[{"start":8,"end":11,"cssClass":"pl-smi"},{"start":14,"end":20,"cssClass":"pl-s1"},{"start":23,"end":35,"cssClass":"pl-en"},{"start":36,"end":41,"cssClass":"pl-s1"}],[{"start":8,"end":12,"cssClass":"pl-smi"},{"start":13,"end":21,"cssClass":"pl-en"},{"start":24,"end":30,"cssClass":"pl-s1"},{"start":31,"end":32,"cssClass":"pl-c1"},{"start":35,"end":45,"cssClass":"pl-en"},{"start":46,"end":52,"cssClass":"pl-s1"},{"start":53,"end":54,"cssClass":"pl-c1"},{"start":57,"end":65,"cssClass":"pl-s1"}],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":26,"cssClass":"pl-en"},{"start":27,"end":31,"cssClass":"pl-smi"},{"start":35,"end":40,"cssClass":"pl-s1"}],[{"start":8,"end":11,"cssClass":"pl-smi"},{"start":14,"end":20,"cssClass":"pl-s1"},{"start":23,"end":35,"cssClass":"pl-en"},{"start":36,"end":41,"cssClass":"pl-s1"}],[{"start":8,"end":14,"cssClass":"pl-k"},{"start":15,"end":19,"cssClass":"pl-smi"},{"start":20,"end":28,"cssClass":"pl-en"},{"start":31,"end":37,"cssClass":"pl-s1"},{"start":38,"end":39,"cssClass":"pl-c1"},{"start":42,"end":49,"cssClass":"pl-en"},{"start":50,"end":56,"cssClass":"pl-s1"},{"start":57,"end":58,"cssClass":"pl-c1"}],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":25,"cssClass":"pl-smi"},{"start":26,"end":35,"cssClass":"pl-smi"},{"start":39,"end":47,"cssClass":"pl-en"}],[{"start":8,"end":14,"cssClass":"pl-k"},{"start":15,"end":20,"cssClass":"pl-s1"}],[],[],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":15,"cssClass":"pl-smi"},{"start":16,"end":24,"cssClass":"pl-en"},{"start":25,"end":39,"cssClass":"pl-smi"},{"start":40,"end":49,"cssClass":"pl-smi"},{"start":53,"end":58,"cssClass":"pl-s1"}],[{"start":8,"end":12,"cssClass":"pl-smi"},{"start":13,"end":18,"cssClass":"pl-s1"},{"start":21,"end":26,"cssClass":"pl-s1"}],[],[],[]],"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":null,"configFilePath":null,"networkDependabotPath":"/cwru-courses/CSDS233-s23-2/network/updates","dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":false,"repoAlertsPath":"/cwru-courses/CSDS233-s23-2/security/dependabot","repoSecurityAndAnalysisPath":"/cwru-courses/CSDS233-s23-2/settings/security_analysis","repoOwnerIsOrg":true,"currentUserCanAdminRepo":true},"displayName":"CustomHashTable.java","displayUrl":"https://github.com/cwru-courses/CSDS233-s23-2/blob/main/Programming%20Project%203/src/Prog3/CustomHashTable.java?raw=true","headerInfo":{"blobSize":"1.09 KB","deleteInfo":{"deleteTooltip":"Delete this file"},"editInfo":{"editTooltip":"Edit this file"},"ghDesktopPath":"x-github-client://openRepo/https://github.com/cwru-courses/CSDS233-s23-2?branch=main&filepath=Programming%20Project%203%2Fsrc%2FProg3%2FCustomHashTable.java","gitLfsPath":null,"onBranch":true,"shortPath":"b51d9d0","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgithub.com%2Fcwru-courses%2FCSDS233-s23-2%2Fblob%2Fmain%2FProgramming%2520Project%25203%2Fsrc%2FProg3%2FCustomHashTable.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"41","truncatedSloc":"31"},"mode":"file"},"image":false,"isCodeownersFile":null,"isPlain":false,"isValidLegacyIssueTemplate":false,"issueTemplateHelpUrl":"https://docs.github.com/articles/about-issue-and-pull-request-templates","issueTemplate":null,"discussionTemplate":null,"language":"Java","languageID":181,"large":false,"loggedIn":true,"newDiscussionPath":"/cwru-courses/CSDS233-s23-2/discussions/new","newIssuePath":"/cwru-courses/CSDS233-s23-2/issues/new","planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/cwru-courses/CSDS233-s23-2/blob/main/Programming%20Project%203/src/Prog3/CustomHashTable.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","dismissStackNoticePath":"/settings/dismiss-notice/publish_stack_from_file","releasePath":"/cwru-courses/CSDS233-s23-2/releases/new?marketplace=true","showPublishActionBanner":false,"showPublishStackBanner":false},"renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"shortPath":null,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"repoOwner":"cwru-courses","repoName":"CSDS233-s23-2","showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","showDependabotConfigurationBanner":null,"actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timedOut":false,"notAnalyzed":false,"symbols":[{"name":"CustomHashTable","kind":"class","identStart":30,"identEnd":45,"extentStart":17,"extentEnd":1116,"fullyQualifiedName":"CustomHashTable","identUtf16":{"start":{"lineNumber":3,"utf16Col":13},"end":{"lineNumber":3,"utf16Col":28}},"extentUtf16":{"start":{"lineNumber":3,"utf16Col":0},"end":{"lineNumber":40,"utf16Col":1}}},{"name":"array","kind":"field","identStart":89,"identEnd":94,"extentStart":53,"extentEnd":124,"fullyQualifiedName":"CustomHashTable::array","identUtf16":{"start":{"lineNumber":5,"utf16Col":40},"end":{"lineNumber":5,"utf16Col":45}},"extentUtf16":{"start":{"lineNumber":5,"utf16Col":4},"end":{"lineNumber":5,"utf16Col":75}}},{"name":"CustomHashTable","kind":"method","identStart":137,"identEnd":152,"extentStart":130,"extentEnd":304,"fullyQualifiedName":"CustomHashTable::CustomHashTable","identUtf16":{"start":{"lineNumber":7,"utf16Col":11},"end":{"lineNumber":7,"utf16Col":26}},"extentUtf16":{"start":{"lineNumber":7,"utf16Col":4},"end":{"lineNumber":11,"utf16Col":5}}},{"name":"hashFunction","kind":"method","identStart":330,"identEnd":342,"extentStart":310,"extentEnd":604,"fullyQualifiedName":"CustomHashTable::hashFunction","identUtf16":{"start":{"lineNumber":13,"utf16Col":24},"end":{"lineNumber":13,"utf16Col":36}},"extentUtf16":{"start":{"lineNumber":13,"utf16Col":4},"end":{"lineNumber":20,"utf16Col":5}}},{"name":"insert","kind":"method","identStart":622,"identEnd":628,"extentStart":610,"extentEnd":778,"fullyQualifiedName":"CustomHashTable::insert","identUtf16":{"start":{"lineNumber":22,"utf16Col":16},"end":{"lineNumber":22,"utf16Col":22}},"extentUtf16":{"start":{"lineNumber":22,"utf16Col":4},"end":{"lineNumber":25,"utf16Col":5}}},{"name":"getElement","kind":"method","identStart":796,"identEnd":806,"extentStart":784,"extentEnd":935,"fullyQualifiedName":"CustomHashTable::getElement","identUtf16":{"start":{"lineNumber":27,"utf16Col":16},"end":{"lineNumber":27,"utf16Col":26}},"extentUtf16":{"start":{"lineNumber":27,"utf16Col":4},"end":{"lineNumber":30,"utf16Col":5}}},{"name":"getArray","kind":"method","identStart":976,"identEnd":984,"extentStart":941,"extentEnd":1016,"fullyQualifiedName":"CustomHashTable::getArray","identUtf16":{"start":{"lineNumber":32,"utf16Col":39},"end":{"lineNumber":32,"utf16Col":47}},"extentUtf16":{"start":{"lineNumber":32,"utf16Col":4},"end":{"lineNumber":34,"utf16Col":5}}},{"name":"setArray","kind":"method","identStart":1034,"identEnd":1042,"extentStart":1022,"extentEnd":1113,"fullyQualifiedName":"CustomHashTable::setArray","identUtf16":{"start":{"lineNumber":36,"utf16Col":16},"end":{"lineNumber":36,"utf16Col":24}},"extentUtf16":{"start":{"lineNumber":36,"utf16Col":4},"end":{"lineNumber":38,"utf16Col":5}}}]}},"copilotInfo":null,"csrf_tokens":{"/cwru-courses/CSDS233-s23-2/branches":{"post":"F-Zv4yJjXK3FPvXEEEaWaqQIUEpHq0__dDn6KlIcvNLxc3GHG3B_o3h8zapoQPcXaz0BN2j6Yxp14lRKv4uQsQ"},"/repos/preferences":{"post":"BioIiSGow7zFCKXsn8JHSjB5QRwMZ-A5z7T4J3K8OyAG2ZrA1G6v3j0rWyQsxVrUS3QHPtW2JFOP9O1gXYBuJQ"}}},"title":"CSDS233-s23-2/Programming Project 3/src/Prog3/CustomHashTable.java at main · cwru-courses/CSDS233-s23-2"}